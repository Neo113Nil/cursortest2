package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.MinElf;
import com.vk.avatarpicker.AvatarPickerActivity;
import com.vk.contacts.AndroidContact;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.dto.user.UserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.groupadmin.BannedUserSettingsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9x0;
import xsna.iwv;
import xsna.o0r0;
import xsna.r5q0;

/* compiled from: VkActionsBridge.kt */
/* loaded from: classes11.dex */
public final class b7u0 implements iwv {
    public final Object b;

    public b7u0(Lazy<? extends NewsfeedRouterComponent> lazy) {
        this.b = lazy;
    }

    @Override // xsna.iwv
    public final void a(Context context, String str) {
        new wzv(context).o(str);
    }

    @Override // xsna.iwv
    public final void b(Context context, String str) {
        new wzv(context).p(str);
    }

    @Override // xsna.iwv
    public final void c(Context context, k320 k320Var) {
        if (k320Var instanceof x120) {
            xwk.e().m(context, com.vk.dto.common.a.b(((x120) k320Var).b()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        } else if (!(k320Var instanceof xi10)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.iwv
    public final void d(Context context, String str) {
        new wzv(context).u(str);
    }

    @Override // xsna.iwv
    public final void e(Context context, String str) {
        new wzv(context).s(str);
    }

    @Override // xsna.iwv
    public final void g(Context context, Collection<AndroidContact> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            g5g.y(((AndroidContact) it.next()).f(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(drm0.p0((String) it2.next()).toString());
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(p4g.k(arrayList2, ";", null))));
        intent.putExtra("sms_body", context.getString(R.string.vkim_contacts_invite_text));
        if (tax.a(context, intent)) {
            context.startActivity(intent);
        } else {
            mhy.a(context, context.getString(R.string.vkim_contacts_invite_link));
            cvk.u(R.string.vkim_contacts_invite_error_toast, false);
        }
    }

    @Override // xsna.iwv
    public final void h(Context context, String str, String str2, String str3, String str4, int i) {
        hf3.d(new np20(i, context, null, new iq20(null, str2, str4, null, null, null, null, null, 249), new aq20(null, null, null, null, null, null, str, false, str3, false, 2943), 4));
    }

    @Override // xsna.iwv
    public final boolean j(Context context) {
        boolean z;
        iwv.a.getClass();
        ComponentName componentName = iwv.a.b;
        if (!xhr0.b(context, componentName.getPackageName())) {
            return false;
        }
        try {
            z = context.getPackageManager().getApplicationInfo(componentName.getPackageName(), 0).enabled;
        } catch (Throwable unused) {
            z = false;
        }
        return z;
    }

    @Override // xsna.iwv
    public final void k(Context context, long j, String str) {
        new wzv(context).n(str, "im" + j);
    }

    @Override // xsna.iwv
    public final void m(Context context, Attach attach, com.vk.im.engine.models.messages.a aVar, qtd0 qtd0Var, Long l, View view, boolean z) {
        new wzv(context).m(aVar, attach, l, z);
    }

    @Override // xsna.iwv
    public final void n(Context context, String str) {
        boolean j = j(context);
        iwv.a aVar = iwv.a;
        if (!j) {
            aVar.getClass();
            gau.d(context, iwv.a.b.getPackageName(), "utm_source%3D".concat(str));
            return;
        }
        Intent intent = new Intent();
        aVar.getClass();
        intent.setComponent(iwv.a.b);
        intent.putExtra("__source_package_name_", context.getPackageName());
        context.startActivity(intent);
    }

    public final void o(Context context, AttachDoc attachDoc) {
        boolean z;
        r5q0 a;
        if (!attachDoc.j() || !attachDoc.X6()) {
            p(context, attachDoc.getUrl(), attachDoc.getFileName());
            return;
        }
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
        FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            r5q0.a aVar = new r5q0.a();
            aVar.c(attachDoc.getFileName());
            aVar.d(attachDoc.getUrl());
            a = aVar.a(null);
            a.Wn(supportFragmentManager, null);
        }
    }

    public final void p(Context context, String str, String str2) {
        new wzv(context).a(str, str2);
    }

    public final void q(Context context, Attach attach, Boolean bool, long j) {
        new wzv(context).l(attach, bool, j);
    }

    public final void r(u90 u90Var, UserId userId, UserProfile userProfile) {
        BannedUserSettingsFragment.ro(u90Var, userId, userProfile, Integer.valueOf(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE));
    }

    public final void s(Context context, mxv mxvVar) {
        mxvVar.getClass();
        bpn0 bpn0Var = enj.a;
        szv.a(k9u0.a, e3m.h(context), null, new com.vk.movika.sdk.base.presenter.c(25, mxvVar, context), null, null, 26);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void t(Context context, String str) {
        NewsfeedRouter.w(((NewsfeedRouterComponent) this.b.getValue()).l0(), context, str, null, c9x0.c.b, null, 52);
    }

    public final void u(Context context) {
        new wzv(context).t();
    }

    public final void v(u90 u90Var, StoryBoxPrepared storyBoxPrepared, String str) {
        WebStoryBox Cb = storyBoxPrepared.Cb();
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("vk_app", str == null ? "mini_app" : str);
        WebServiceInfo Ab = Cb.Ab();
        if ((Ab != null ? Ab.Eb() : null) != null && epx.f(str, "VIRAL_TEMPLATE".toLowerCase(Locale.ROOT))) {
            aVar.E();
        }
        aVar.v(storyBoxPrepared.Bb());
        StoryCameraParams.a.r(aVar, o25.a().c(), null, 6);
        aVar.x(Cb);
        aVar.m(storyBoxPrepared.zb());
        WebServiceInfo Ab2 = Cb.Ab();
        aVar.j(Ab2 != null ? Ab2.Ab() : null);
        WebServiceInfo Ab3 = Cb.Ab();
        aVar.o(Ab3 != null ? Ab3.Db() : false);
        WebServiceInfo Ab4 = Cb.Ab();
        aVar.i(Ab4 != null ? Ab4.zb() : null);
        WebServiceInfo Ab5 = Cb.Ab();
        aVar.l(Ab5 != null ? Ab5.Cb() : null);
        WebServiceInfo Ab6 = Cb.Ab();
        aVar.k(Ab6 != null ? Ab6.Bb() : null);
        aVar.u(storyBoxPrepared.Ab());
        aVar.f(e43.o(StoryCameraMode.STORY, StoryCameraMode.STORY_VIDEO, StoryCameraMode.PING_PONG));
        aVar.m(storyBoxPrepared.zb());
        if (!Cb.Bb()) {
            if (Cb.Cb()) {
                aVar.d();
            } else {
                aVar.c();
            }
        }
        WebServiceInfo Ab7 = Cb.Ab();
        aVar.w(Ab7 != null ? Ab7.Eb() : null);
        aVar.D(u90Var, 103, null);
    }

    public final void w(Context context, String str, String str2) {
        wzv.r(new wzv(context), str, str2, 10);
    }

    public final void x(Activity activity, WebApiApplication webApiApplication, String str, String str2, String str3) {
        hf3.c(new op20(n34.C(webApiApplication), activity, new mq20(str, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(null, str2, str3, null, null, null, null, null, 249), null, 16));
    }

    public final void y(u90 u90Var, int i) {
        int i2 = AvatarPickerActivity.g;
        u90Var.D(AvatarPickerActivity.a.b(u90Var.B()), i, null);
    }

    public final void z(u90 u90Var, int i) {
        int i2 = AvatarPickerActivity.g;
        u90Var.D(AvatarPickerActivity.a.d(u90Var.B()), i, null);
    }
}
