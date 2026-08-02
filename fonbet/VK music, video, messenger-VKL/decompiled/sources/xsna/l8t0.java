package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoProfileMoreBottomSheet.kt */
/* loaded from: classes6.dex */
public final class l8t0 extends wx20 {
    public final j70 c;
    public final xqf d;
    public final sje e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoProfileMoreBottomSheet.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ActionReport;
        public static final a ActionShare;

        static {
            a aVar = new a("ActionReport", 0);
            ActionReport = aVar;
            a aVar2 = new a("ActionShare", 1);
            ActionShare = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoProfileMoreBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ActionShare.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ActionReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l8t0(j70 j70Var, xqf xqfVar, sje sjeVar, boolean z) {
        this.c = j70Var;
        this.d = xqfVar;
        this.e = sjeVar;
        this.f = z;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        e520 e520Var;
        zrp<a> h = a.h();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            int i = b.$EnumSwitchMapping$0[((a) it.next()).ordinal()];
            if (i == 1) {
                e520Var = this.f ? new e520(R.id.video_profile_more_share, R.drawable.vk_icon_share_outline_28, R.string.video_profile_talkback_share_button, a.ActionShare.ordinal(), false, 0, 0, false, null, 0, null, false, 8176) : null;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e520Var = new e520(R.id.video_profile_more_report, R.drawable.vk_icon_report_outline_28, R.string.vk_video_profile_report, a.ActionReport.ordinal(), false, 0, 0, false, null, 0, null, false, 8176);
            }
            if (e520Var != null) {
                arrayList.add(e520Var);
            }
        }
        return arrayList;
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        int i = e520Var.a;
        if (i == R.id.video_profile_more_share) {
            this.c.invoke();
        } else if (i == R.id.video_profile_more_report) {
            this.d.invoke();
        }
    }

    @Override // xsna.wx20
    public final void g() {
        this.e.invoke();
    }
}
