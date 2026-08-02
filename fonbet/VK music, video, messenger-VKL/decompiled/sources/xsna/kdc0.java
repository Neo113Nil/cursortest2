package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;

/* compiled from: PostingBundleArgumentsWriter.kt */
/* loaded from: classes4.dex */
public final class kdc0 {
    public final Bundle a;

    public kdc0(Bundle bundle) {
        this.a = bundle;
    }

    public final void a() {
        this.a.putBoolean("authorOnlyGroup", true);
    }

    public final void b() {
        this.a.putBoolean("canCloseComments", true);
    }

    public final void c(int i, UserId userId, String str, String str2, boolean z, boolean z2, boolean z3) {
        Bundle bundle = this.a;
        bundle.putParcelable("additionalAuthorGroupId", userId);
        bundle.putString("group_title", str);
        bundle.putString("group_photo", str2);
        bundle.putBoolean("group_is_admin", z);
        bundle.putInt("admin_level", i);
        bundle.putBoolean("can_post_donut", z2);
        bundle.putBoolean("open_from_group", true);
        bundle.putBoolean("group_photo_is_nft", z3);
    }

    public final void d() {
        this.a.putBoolean("posterAllowed", true);
    }

    public final void e(String str) {
        this.a.putString("ref", str);
    }

    public final void f() {
        this.a.putBoolean("withoutAuthorChange", true);
    }

    public final void g() {
        this.a.putBoolean("withoutPostpone", true);
    }

    public final void h() {
        this.a.putBoolean("withoutSign", true);
    }

    public final void i() {
        this.a.putBoolean("withoutVisibilityChange", true);
    }
}
