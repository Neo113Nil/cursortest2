package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;

/* compiled from: StatisticsMiniAppRouterImpl.kt */
/* loaded from: classes5.dex */
public final class tyk0 implements syk0 {
    public final Context a;
    public final maz b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StatisticsMiniAppRouterImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLIP;
        public static final a POST;
        private final String detailsPath = "owner_content_details";
        private final String topPath;
        private final String typeName;

        static {
            a aVar = new a("CLIP", 0, "top_clips", "clip");
            CLIP = aVar;
            a aVar2 = new a("POST", 1, null, "post");
            POST = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2, String str3) {
            this.topPath = str2;
            this.typeName = str3;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String h() {
            return this.detailsPath;
        }

        public final String i() {
            return this.topPath;
        }

        public final String j() {
            return this.typeName;
        }
    }

    public tyk0(Context context, maz mazVar) {
        this.a = context;
        this.b = mazVar;
    }

    @Override // xsna.syk0
    public final void a(int i, UserId userId) {
        d(userId, Integer.valueOf(i), a.POST);
    }

    @Override // xsna.syk0
    public final void b(UserId userId, Integer num) {
        d(userId, num, a.CLIP);
    }

    @Override // xsna.syk0
    public final void c(UserId userId) {
        d(userId, null, null);
    }

    public final void d(UserId userId, Integer num, a aVar) {
        izs dvh0Var;
        Uri.Builder appendPath = jeq0.g(f870.v(InternalVkMiniApps.USER_STATS.h())).buildUpon().appendEncodedPath("#").appendPath(String.valueOf(userId.b));
        if (aVar != null) {
            if (num == null && aVar.i() != null) {
                dvh0Var = new nt10(aVar, 26);
            } else if (num != null) {
                dvh0Var = new dvh0(2, aVar, num);
            }
            String str = (aVar == a.CLIP && num == null) ? null : "content_statistics";
            Uri.Builder appendEncodedPath = appendPath.appendEncodedPath("");
            if (str != null) {
                appendEncodedPath.appendEncodedPath(str);
            }
            dvh0Var.invoke(appendEncodedPath);
        }
        maz.c(this.b, this.a, appendPath.build().toString(), LaunchContext.A, null, null, 24);
    }
}
