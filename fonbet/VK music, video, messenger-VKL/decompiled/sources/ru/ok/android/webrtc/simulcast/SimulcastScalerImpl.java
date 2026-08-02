package ru.ok.android.webrtc.simulcast;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.Size;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.utils.UtilsKt;
import xsna.c5g;
import xsna.cjz0;
import xsna.e43;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class SimulcastScalerImpl implements SimulcastScaler {
    public static final Companion Companion = new Companion(null);
    public final CropAndScaleParamsProvider a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public SimulcastScalerImpl(CropAndScaleParamsProvider cropAndScaleParamsProvider) {
        this(cropAndScaleParamsProvider, 0, 2, null);
    }

    public static int a(Size size, List list) {
        Object obj;
        Object obj2;
        int maxValue = UtilsKt.getMaxValue(size);
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            if (((PeerVideoSettingsBitrateTable.Bitrate) obj2).getDimension() <= maxValue) {
                break;
            }
        }
        PeerVideoSettingsBitrateTable.Bitrate bitrate = (PeerVideoSettingsBitrateTable.Bitrate) obj2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((PeerVideoSettingsBitrateTable.Bitrate) next).getDimension() >= maxValue) {
                obj = next;
                break;
            }
        }
        PeerVideoSettingsBitrateTable.Bitrate bitrate2 = (PeerVideoSettingsBitrateTable.Bitrate) obj;
        if (bitrate == null && bitrate2 == null) {
            PeerVideoSettingsBitrateTable.Bitrate bitrate3 = (PeerVideoSettingsBitrateTable.Bitrate) j5g.a0(list);
            if (bitrate3 != null) {
                return bitrate3.getBitrate();
            }
            return 0;
        }
        if (bitrate == null) {
            if (bitrate2 != null) {
                return bitrate2.getBitrate();
            }
            return 0;
        }
        if (bitrate2 == null) {
            return bitrate.getBitrate();
        }
        if (bitrate.getDimension() == bitrate2.getDimension()) {
            return bitrate.getBitrate();
        }
        return (((bitrate2.getBitrate() - bitrate.getBitrate()) * (maxValue - bitrate.getDimension())) / (bitrate2.getDimension() - bitrate.getDimension())) + bitrate.getBitrate();
    }

    @Override // ru.ok.android.webrtc.simulcast.SimulcastScaler
    public List<SimulcastLayerInfo> generateSimulcastLayers(Size size, List<PeerVideoSettingsBitrateTable.Bitrate> list, Integer num, SimulcastConfig simulcastConfig, int i, Integer num2) {
        int i2;
        String str;
        List<SimulcastLayerInfo> layers;
        SimulcastLayerInfo simulcastLayerInfo;
        List<SimulcastLayerInfo> layers2;
        SimulcastLayerInfo simulcastLayerInfo2;
        List<SimulcastLayerInfo> layers3;
        SimulcastLayerInfo simulcastLayerInfo3;
        int max = Math.max(size.width, size.height);
        int i3 = 2;
        char c = max < 320 ? (char) 1 : max < 960 ? (char) 2 : (char) 3;
        CropAndScaleParamsProvider cropAndScaleParamsProvider = this.a;
        int i4 = size.width;
        int i5 = size.height;
        Size toScaledSize = UtilsKt.getToScaledSize(cropAndScaleParamsProvider.calculate(i4, i5, i4, i5));
        cjz0 cjz0Var = new cjz0(toScaledSize, a(toScaledSize, list), 1.0d, true, true);
        CropAndScaleParamsProvider cropAndScaleParamsProvider2 = this.a;
        int i6 = size.width;
        int i7 = size.height;
        Size toScaledSize2 = UtilsKt.getToScaledSize(cropAndScaleParamsProvider2.calculate(i6, i7, i6 / 2, i7 / 2));
        cjz0 cjz0Var2 = new cjz0(toScaledSize2, a(toScaledSize2, list), 2.0d, true, true);
        CropAndScaleParamsProvider cropAndScaleParamsProvider3 = this.a;
        int i8 = size.width;
        int i9 = size.height;
        Size toScaledSize3 = UtilsKt.getToScaledSize(cropAndScaleParamsProvider3.calculate(i8, i9, i8 / 4, i9 / 4));
        cjz0 cjz0Var3 = new cjz0(toScaledSize3, a(toScaledSize3, list), 4.0d, false, true);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        List l = e43.l(cjz0Var, cjz0Var2);
        if ((l instanceof Collection) && l.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = l.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (UtilsKt.getMaxValue(((cjz0) it.next()).a) > intValue && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        List l2 = c != 2 ? c != 3 ? e43.l(cjz0Var, cjz0.a(cjz0Var), cjz0.a(cjz0Var)) : i2 != 0 ? i2 != 1 ? e43.l(cjz0Var3, cjz0.a(cjz0Var2), cjz0.a(cjz0Var)) : e43.l(cjz0Var3, cjz0Var2, cjz0.a(cjz0Var)) : e43.l(cjz0Var3, cjz0Var2, cjz0Var) : i2 == 0 ? e43.l(cjz0Var2, cjz0Var, cjz0.a(cjz0Var)) : e43.l(cjz0Var2, cjz0.a(cjz0Var), cjz0.a(cjz0Var));
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        int i10 = 0;
        for (Object obj : l2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e43.t();
                throw null;
            }
            cjz0 cjz0Var4 = (cjz0) obj;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (simulcastConfig == null || (layers3 = simulcastConfig.getLayers()) == null || (simulcastLayerInfo3 = (SimulcastLayerInfo) j5g.b0(i3, layers3)) == null || (str = simulcastLayerInfo3.getRid()) == null) {
                        str = "h";
                    }
                } else if (simulcastConfig == null || (layers2 = simulcastConfig.getLayers()) == null || (simulcastLayerInfo2 = (SimulcastLayerInfo) j5g.b0(1, layers2)) == null || (str = simulcastLayerInfo2.getRid()) == null) {
                    str = InneractiveMediationDefs.GENDER_MALE;
                }
            } else if (simulcastConfig == null || (layers = simulcastConfig.getLayers()) == null || (simulcastLayerInfo = (SimulcastLayerInfo) j5g.b0(0, layers)) == null || (str = simulcastLayerInfo.getRid()) == null) {
                str = "l";
            }
            String str2 = str;
            SimulcastDirection simulcastDirection = SimulcastDirection.SEND;
            boolean z = cjz0Var4.e;
            double d = cjz0Var4.c;
            int i12 = cjz0Var4.b;
            Size size2 = cjz0Var4.a;
            arrayList.add(new SimulcastLayerInfo(str2, simulcastDirection, z, d, i12, 0, i, 1, size2.width, size2.height, 32, null));
            i10 = i11;
            i3 = 2;
        }
        return arrayList;
    }

    public SimulcastScalerImpl(CropAndScaleParamsProvider cropAndScaleParamsProvider, int i) {
        this.a = cropAndScaleParamsProvider;
    }

    public /* synthetic */ SimulcastScalerImpl(CropAndScaleParamsProvider cropAndScaleParamsProvider, int i, int i2, zcl zclVar) {
        this(cropAndScaleParamsProvider, (i2 & 2) != 0 ? 16 : i);
    }
}
