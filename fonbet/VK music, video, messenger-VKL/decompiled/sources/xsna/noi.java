package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.ui.modal.VkModal;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.video.stat.transport.internal.upload.UploadExecutionResult;
import xsna.i2h0;
import xsna.q8z;
import xsna.u8r;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class noi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ noi(byte b, int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        iar iarVar;
        dt2 dt2Var;
        Object a;
        int i = 6;
        int i2 = 1;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(258189194, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkSegmentedControlKt.lambda$258189194.<anonymous> (VkSegmentedControl.kt:321)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = qq.h(2, aVar);
                    }
                    wh50 wh50Var = (wh50) x;
                    ejv0.a(null, Integer.valueOf(((Number) wh50Var.getValue()).intValue()), false, null, kai.c(-1091511331, new b15(wh50Var, i2), aVar), aVar, 24576, 13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                aVar2.K(-1832487823);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1832487823, intValue2, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.actions.DoNotShowSimilar.getAction.<anonymous> (DoNotShowSimilar.kt:23)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-722538232, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-RemoveCircleOutline28> (VkSdkIcons.kt:2938)");
                }
                lg90 b = or.b(aVar2, 1239801810, R.drawable.vk_icon_remove_circle_outline_28, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return b;
            case 2:
                dbq0 dbq0Var = (dbq0) obj;
                UploadExecutionResult uploadExecutionResult = (UploadExecutionResult) obj2;
                i100 i100Var = dbq0Var.e;
                up70 up70Var = u8r.d;
                if (up70Var == null) {
                    up70Var = null;
                }
                up70Var.o("FileEventStorage", new com.vk.movika.tools.controls.seekbar.g(i, dbq0Var, uploadExecutionResult));
                xti0 xti0Var = dbq0Var.b;
                LinkedHashMap linkedHashMap = u8r.j;
                synchronized (linkedHashMap) {
                    iarVar = (iar) linkedHashMap.get(xti0Var);
                }
                if (iarVar != null) {
                    switch (u8r.c.$EnumSwitchMapping$0[uploadExecutionResult.ordinal()]) {
                        case 1:
                            i100Var.o("UploadFile", new d3j0(dbq0Var, 9));
                            try {
                                dbq0Var.a.delete();
                            } catch (Throwable unused) {
                            }
                            dbq0 c = u8r.c(iarVar);
                            if (c != null) {
                                ibq0 ibq0Var = u8r.g;
                                (ibq0Var != null ? ibq0Var : null).c(c);
                                break;
                            }
                            break;
                        case 2:
                        case 3:
                            u8r.a(xti0Var);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i100Var.o("UploadFile", new gqh0(dbq0Var, 10));
                            dbq0Var.f++;
                            ibq0 ibq0Var2 = u8r.g;
                            (ibq0Var2 != null ? ibq0Var2 : null).c(dbq0Var);
                            break;
                        case 8:
                            ibq0 ibq0Var3 = u8r.g;
                            (ibq0Var3 != null ? ibq0Var3 : null).c(dbq0Var);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 3:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 4:
                ((Integer) obj2).getClass();
                qqz.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                f2h0 f2h0Var = (f2h0) obj;
                us2.d dVar = (us2.d) obj2;
                T t = dVar.a;
                if (t instanceof fh90) {
                    dt2Var = dt2.Paragraph;
                } else if (t instanceof hik0) {
                    dt2Var = dt2.Span;
                } else if (t instanceof smr0) {
                    dt2Var = dt2.VerbatimTts;
                } else if (t instanceof seq0) {
                    dt2Var = dt2.Url;
                } else if (t instanceof q8z.b) {
                    dt2Var = dt2.Link;
                } else if (t instanceof q8z.a) {
                    dt2Var = dt2.Clickable;
                } else {
                    if (!(t instanceof wpm0)) {
                        throw new UnsupportedOperationException();
                    }
                    dt2Var = dt2.String;
                }
                switch (i2h0.c.$EnumSwitchMapping$0[dt2Var.ordinal()]) {
                    case 1:
                        a = i2h0.a((fh90) t, i2h0.h, f2h0Var);
                        break;
                    case 2:
                        a = i2h0.a((hik0) t, i2h0.i, f2h0Var);
                        break;
                    case 3:
                        a = i2h0.a((smr0) t, i2h0.d, f2h0Var);
                        break;
                    case 4:
                        a = i2h0.a((seq0) t, i2h0.e, f2h0Var);
                        break;
                    case 5:
                        a = i2h0.a((q8z.b) t, i2h0.f, f2h0Var);
                        break;
                    case 6:
                        a = i2h0.a((q8z.a) t, i2h0.g, f2h0Var);
                        break;
                    case 7:
                        a = ((wpm0) t).a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return e43.a(dt2Var, a, Integer.valueOf(dVar.b), Integer.valueOf(dVar.c), dVar.d);
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(1254350076);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1254350076, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:148)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                ((VkModal) obj).a();
                maz.c(xwk.d().e(), (Context) obj2, i5s.a(new StringBuilder("https://"), a0a.d, "/apps?act=games"), LaunchContext.A, null, null, 24);
                return s3q0.a;
        }
    }
}
