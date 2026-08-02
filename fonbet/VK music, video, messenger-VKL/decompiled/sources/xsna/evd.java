package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ClipsFeatures;
import java.util.ArrayList;
import java.util.List;
import xsna.jsc;

/* compiled from: ClipsEditSdkCoauthorsHandlerVk.kt */
/* loaded from: classes16.dex */
public final class evd implements jsc {
    public final jmd a;
    public final otc b;
    public final boolean c;

    /* compiled from: ClipsEditSdkCoauthorsHandlerVk.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CoauthorType.values().length];
            try {
                iArr[CoauthorType.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoauthorType.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoauthorType.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipCoauthorSdkItem.Type.values().length];
            try {
                iArr2[ClipCoauthorSdkItem.Type.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipCoauthorSdkItem.Type.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipCoauthorSdkItem.Type.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public evd(jmd jmdVar, otc otcVar) {
        this.a = jmdVar;
        this.b = otcVar;
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        this.c = com.vk.toggle.b.A.a(clipsFeatures);
    }

    @Override // xsna.jsc
    public final boolean a() {
        return this.c;
    }

    @Override // xsna.jsc
    public final otc b() {
        return this.b;
    }

    @Override // xsna.jsc
    public final void c(jsc.a aVar, List list, UserId userId, int i, fb fbVar) {
        FragmentManager fragmentManager = aVar.b;
        fragmentManager.l0("co_request", aVar.c, new kx2(aVar, list, fbVar));
        Context context = aVar.a;
        List<ClipCoauthorSdkItem> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ClipCoauthorSdkItem clipCoauthorSdkItem : list2) {
            UserId userId2 = clipCoauthorSdkItem.b;
            String str = clipCoauthorSdkItem.c;
            String str2 = clipCoauthorSdkItem.d;
            ClipCoauthorSdkItem.Type type = clipCoauthorSdkItem.e;
            int i2 = type == null ? -1 : a.$EnumSwitchMapping$1[type.ordinal()];
            arrayList.add(new ClipsCoauthorsSelectInputModel(userId2, str, str2, false, i2 != 1 ? i2 != 2 ? i2 != 3 ? CoauthorType.Male : CoauthorType.Community : CoauthorType.Female : CoauthorType.Male));
        }
        this.a.b(context, new ClipsCoauthorsSelectorInputParams(true, j5g.S0(arrayList), "co_request", "co_result", userId, true, ClipsCoauthorsSelectorInputParams.ImmediateSave.Disabled.b, new ClipsCoauthorsSelectorInputParams.OpenFrom.Clips(Integer.valueOf(i))), fragmentManager);
    }
}
