package com.vkontakte.android;

import android.R;
import android.app.ActivityOptions;
import android.app.RemoteInput;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.facebook.soloader.MinElf;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.common.links.LaunchContext;
import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.device.store.AppStore;
import com.vk.dto.clips.exceptions.ClipNotFoundException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.exceptions.PostNotFoundException;
import com.vk.log.L;
import com.vk.stat.AppStartReporter;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.activities.LogoutReceiver;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.ar;
import xsna.awl;
import xsna.bpn0;
import xsna.brm0;
import xsna.cty;
import xsna.cvk;
import xsna.d3r0;
import xsna.dor0;
import xsna.e3m;
import xsna.e43;
import xsna.e4y0;
import xsna.enj;
import xsna.epx;
import xsna.fkq0;
import xsna.fpf0;
import xsna.g2v;
import xsna.go9;
import xsna.haz;
import xsna.hnj;
import xsna.iah0;
import xsna.izs;
import xsna.j6i;
import xsna.jh;
import xsna.k840;
import xsna.l93;
import xsna.laz;
import xsna.m33;
import xsna.m7m;
import xsna.mh70;
import xsna.mok;
import xsna.msy;
import xsna.n6j;
import xsna.n7w;
import xsna.naz;
import xsna.nk8;
import xsna.o0r0;
import xsna.o25;
import xsna.o2l;
import xsna.ocw;
import xsna.pbw;
import xsna.peq0;
import xsna.q6r0;
import xsna.r55;
import xsna.ro;
import xsna.s3q0;
import xsna.s750;
import xsna.sk8;
import xsna.to10;
import xsna.u750;
import xsna.ui70;
import xsna.uzp0;
import xsna.v7x;
import xsna.xwk;
import xsna.y2j;
import xsna.yp80;
import xsna.z4g;
import xsna.zkx0;

/* compiled from: LinkRedirActivity.kt */
/* loaded from: classes11.dex */
public final class LinkRedirActivity extends BaseLinkRedirectActivity {
    public static final List<String> m = Collections.singletonList("/feed");
    public static final List<String> n = e43.l("/login", "/join");
    public boolean h;
    public LogoutReceiver i;
    public final bpn0 j = new bpn0(new cty(this, 1));
    public final u750 k;
    public final Object l;

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class a implements BaseLinkRedirectActivity.c {
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return intent.getData() == null;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            cvk.u(R.string.error, false);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class b implements BaseLinkRedirectActivity.c {
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return (!CommonConstant.ACTION.HWID_SCHEME_URL.equals(intent.getAction()) || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(intent.getData().getScheme()) || naz.j(intent.getData())) ? false : true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            L.l("disallow open not vk link " + intent.getData());
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class d implements BaseLinkRedirectActivity.c {
        public d() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            return epx.f(data != null ? data.getPath() : null, "/handle_external_user_confirmation");
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            Intent addFlags = new Intent(context, (Class<?>) MainActivity.class).addFlags(268468224);
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            y2j d2 = ((ConfirmAccountComponent) m7m.a(linkRedirActivity).mo408a(fpf0.a(ConfirmAccountComponent.class))).d2();
            String valueOf = String.valueOf(intent.getData());
            if (d2.a.isEmpty()) {
                linkRedirActivity.startActivity(addFlags);
                return;
            }
            d2.b = valueOf;
            Iterator<izs<String, s3q0>> it = d2.a.iterator();
            while (it.hasNext()) {
                it.next().invoke(valueOf);
            }
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class e implements BaseLinkRedirectActivity.c {
        public e() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data != null) {
                return naz.k(data);
            }
            return false;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            Intent addFlags = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268435456);
            addFlags.putExtra("key_open_qr_auth", String.valueOf(intent.getData()));
            linkRedirActivity.startActivity(addFlags);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class f implements BaseLinkRedirectActivity.c {
        public f() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return (fkq0.c(q6r0.f().y()) || xwk.d().e().i(context, intent.getData())) ? false : true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            Intent addFlags = new Intent(LinkRedirActivity.this.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268468224);
            Uri data = intent.getData();
            if (data != null) {
                String uri = data.toString();
                if (xwk.d().g().c(context, uri).b.length() > 0) {
                    addFlags.putExtra("key_call_join_url", uri);
                } else {
                    String authority = data.getAuthority();
                    String path = data.getPath();
                    String query = data.getQuery();
                    boolean z = true;
                    if (TextUtils.equals(authority, a0a.d)) {
                        Iterator<String> it = LinkRedirActivity.m.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (TextUtils.equals(path, it.next()) && TextUtils.isEmpty(query)) {
                                z = false;
                                break;
                            }
                        }
                        Iterator<String> it2 = LinkRedirActivity.n.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next = it2.next();
                            if (path != null && brm0.B(path, next, false)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        addFlags.putExtra("key_open_after_auth_link", uri);
                    }
                }
                String queryParameter = data.getQueryParameter("reg_unauth_id");
                if (queryParameter != null) {
                    addFlags.putExtra("reg_unauth_id", queryParameter);
                }
                String queryParameter2 = data.getQueryParameter("ah");
                if (queryParameter2 != null && SakFeatures.Type.INVITE_LINKS.h()) {
                    addFlags.putExtra("key_invite_hash", queryParameter2);
                }
            }
            LinkRedirActivity.this.startActivity(addFlags);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class g extends BaseLinkRedirectActivity.a {
        public g() {
            super(R.string.vnd_voipcall);
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.a
        public final void e(long j, Context context) {
            UserId userId = new UserId(j);
            MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.SYSTEM_PROFILE;
            UiTracker uiTracker = UiTracker.a;
            com.vk.common.links.c.d0(context, userId, new VoipCallSource(source, UiTracker.c()), false, null, "", null);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class h extends BaseLinkRedirectActivity.a {
        public h() {
            super(R.string.vnd_sendmsg);
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.a
        public final void e(long j, Context context) {
            g2v.c().b().t(context, j, null, "address_book", "address_book");
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class i implements BaseLinkRedirectActivity.c {
        public i() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return intent.getCategories() != null && intent.getCategories().contains(NotificationCompat.INTENT_CATEGORY_NOTIFICATION_PREFERENCES);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            ((mh70) LinkRedirActivity.this.l.getValue()).c(context);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class j implements BaseLinkRedirectActivity.c {
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return "android.intent.action.SEND".equals(intent.getAction());
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            xwk.d().getBrowser().h(context, String.valueOf(intent.getData()));
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class k extends BaseLinkRedirectActivity.a {
        public k() {
            super(R.string.vnd_profile);
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.a
        public final void e(long j, Context context) {
            xwk.e().m(context, new UserId(j), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class l implements BaseLinkRedirectActivity.c {
        public l() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            return fkq0.c(q6r0.f().y()) && (data != null ? data.getQueryParameter("reg_unauth_id") : null) != null;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            String queryParameter;
            Object failure;
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            Intent addFlags = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268468224);
            Uri data = intent.getData();
            if (data != null && (queryParameter = data.getQueryParameter("reg_unauth_id")) != null) {
                addFlags.putExtra("reg_unauth_id", queryParameter);
                try {
                    r55 r55Var = r55.a;
                    int size = r55.g().d().size();
                    to10 to10Var = r55.f().b;
                    failure = Boolean.valueOf(size >= 3);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Object obj = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = obj;
                }
                addFlags.putExtra("account_limit_reached", ((Boolean) failure).booleanValue());
            }
            linkRedirActivity.startActivity(addFlags);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class m implements BaseLinkRedirectActivity.c {
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data == null) {
                return false;
            }
            Object obj = naz.a;
            if (!URLUtil.isNetworkUrl(data.toString()) || !naz.s(data)) {
                return false;
            }
            Regex regex = (Regex) laz.I.getValue();
            String path = data.getPath();
            if (path == null) {
                path = "";
            }
            return regex.f(path);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x0074, code lost:
        
            if (r4.isEmpty() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0078, code lost:
        
            r6 = (xsna.nk8) r4.get(0);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:1: B:9:0x0029->B:66:?, LOOP_END, SYNTHETIC] */
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Context context, Intent intent) {
            nk8 nk8Var;
            Intent intent2;
            Bitmap bitmap;
            boolean z;
            Uri data = intent.getData();
            if (data != null) {
                Context a = hnj.a(context);
                List<dor0> list = zkx0.a;
                try {
                    ArrayList a2 = sk8.a(context);
                    Iterator it = a2.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        nk8Var = (nk8) it.next();
                        for (dor0 dor0Var : zkx0.a) {
                            if (dor0Var.a.equals(nk8Var.a) && dor0Var.d == nk8Var.d.booleanValue()) {
                                v7x v7xVar = dor0Var.c;
                                awl b = awl.b(nk8Var.c);
                                awl awlVar = (awl) v7xVar.c;
                                if ((awlVar == null || awlVar.compareTo(b) <= 0) && dor0Var.b.equals(nk8Var.b)) {
                                    z = true;
                                    if (!z) {
                                        break loop0;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e("BrowserSelector", "Exception in select browser", e);
                }
                nk8Var = null;
                if (nk8Var != null ? epx.f(nk8Var.d, Boolean.TRUE) : false) {
                    int f = e3m.f(R.attr.vk_ui_text_accent_themed, a);
                    Drawable a3 = m33.a(R.drawable.vk_icon_arrow_left_outline_28, context);
                    if (a3 != null) {
                        if (f != 0) {
                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                            a3.mutate();
                            a3.setColorFilter(new PorterDuffColorFilter(f, mode));
                        }
                        if (a3.getIntrinsicHeight() > 0 && a3.getIntrinsicWidth() > 0) {
                            int a4 = iah0.a(24);
                            bitmap = Bitmap.createBitmap(a4, a4, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            Rect bounds = a3.getBounds();
                            try {
                                a3.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                a3.draw(canvas);
                                mok.a aVar = new mok.a();
                                Intent intent3 = aVar.a;
                                intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                aVar.d = ar.b(e3m.f(R.attr.vk_ui_header_background, a) | (-16777216), "android.support.customtabs.extra.TOOLBAR_COLOR");
                                aVar.c = ActivityOptions.makeCustomAnimation(a, R.anim.fade_in, R.anim.fade_out).toBundle();
                                aVar.e = 1;
                                intent3.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                                intent3.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                                if (bitmap != null) {
                                    intent3.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
                                }
                                intent2 = aVar.a().a;
                            } finally {
                                a3.setBounds(bounds);
                            }
                        }
                    }
                    bitmap = null;
                    mok.a aVar2 = new mok.a();
                    Intent intent32 = aVar2.a;
                    intent32.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    aVar2.d = ar.b(e3m.f(R.attr.vk_ui_header_background, a) | (-16777216), "android.support.customtabs.extra.TOOLBAR_COLOR");
                    aVar2.c = ActivityOptions.makeCustomAnimation(a, R.anim.fade_in, R.anim.fade_out).toBundle();
                    aVar2.e = 1;
                    intent32.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                    intent32.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                    if (bitmap != null) {
                    }
                    intent2 = aVar2.a().a;
                } else {
                    intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                }
                intent2.setData(data);
                intent2.setPackage(nk8Var != null ? nk8Var.a : null);
                if (e3m.h(context) == null) {
                    intent2.addFlags(268435456);
                }
                try {
                    context.startActivity(intent2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class n implements BaseLinkRedirectActivity.c {
        public n() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data != null) {
                return naz.B(data);
            }
            return false;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            Intent addFlags = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268468224);
            addFlags.putExtra("key_open_qr_auth", String.valueOf(intent.getData()));
            linkRedirActivity.startActivity(addFlags);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class o extends BaseLinkRedirectActivity.b {
        public o() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            return data != null && naz.u(data) && "reply".equals(data.getHost());
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.b
        public final void d(Context context, Intent intent, Uri uri) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (!epx.f(Preference.h(LinkRedirActivity.this, 0, null).getString("msg_reply_hash", ""), uri.getQueryParameter("hash")) || resultsFromIntent == null) {
                return;
            }
            int b = d3r0.b(uri.getQueryParameter("peer"));
            String valueOf = String.valueOf(resultsFromIntent.get("voice_reply"));
            if (b != 0) {
                ocw.b(this, b, valueOf, null, 24);
            }
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class p implements BaseLinkRedirectActivity.c {
        public p() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            return data != null && naz.m(data) && data.getPathSegments().contains("rustore");
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, intent.getData()).addCategory("android.intent.category.BROWSABLE").addFlags(268435456).setPackage(!BuildInfo.h() ? AppStore.RUSTORE.j() : "com.vk.superapp.sample");
            ComponentName resolveActivity = intent2.resolveActivity(context.getPackageManager());
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            if (resolveActivity != null) {
                context.startActivity(intent2);
                linkRedirActivity.finishAndRemoveTask();
            } else {
                Intent addFlags = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268435456);
                addFlags.putExtra("key_open_qr_auth", String.valueOf(intent.getData()));
                linkRedirActivity.startActivity(addFlags);
            }
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class q implements BaseLinkRedirectActivity.c {
        public final Pattern a = Pattern.compile("^sportmailru(\\.m)?\\.vk\\.(com|ru)$");
        public final Pattern b = Pattern.compile("^sportmailru\\.");

        public q() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            String host;
            Uri data = intent.getData();
            if (data == null || (host = data.getHost()) == null) {
                return false;
            }
            return this.a.matcher(host).find();
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            String host;
            Uri data = intent.getData();
            if (data == null || (host = data.getHost()) == null) {
                return;
            }
            String replaceFirst = this.b.matcher(host).replaceFirst("");
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            Intent intent2 = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) LinkRedirActivity.class);
            intent2.setData(data.buildUpon().authority(replaceFirst).build());
            linkRedirActivity.startActivity(intent2);
        }
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class r implements BaseLinkRedirectActivity.c {
        public r() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data == null) {
                return false;
            }
            Object obj = naz.a;
            return (epx.f(data.getHost(), "id.".concat(a0a.d)) || naz.m(data) || epx.f(data.getHost(), "oauth.".concat(a0a.d))) && jh.h("/(code_auth|ca)", new peq0(data), null, null, 14);
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            Intent addFlags = new Intent(linkRedirActivity.getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268435456);
            addFlags.putExtra("key_open_qr_auth", String.valueOf(intent.getData()));
            linkRedirActivity.startActivity(addFlags);
        }
    }

    public LinkRedirActivity() {
        s750 s750Var = k840.a.e;
        this.k = s750Var == null ? null : s750Var;
        this.l = msy.a(LazyThreadSafetyMode.NONE, new n7w(this, 5));
    }

    @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity
    public final List<BaseLinkRedirectActivity.c> O1() {
        return e43.l(new n(), new m(), new d(), new f(), new l(), new i(), new a(), new p(), new e(), new r(), new b(), new j(), new k(), new h(), new g(), new o(), new q(), new c());
    }

    @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity
    public final void Q1() {
        haz.a(this, getIntent().getData());
        Intent intent = getIntent();
        l93 l93Var = new l93();
        o2l.a.getClass();
        AppStartReporter.b(intent, this, l93Var, o2l.b("__dbg_stat_app_starts_daily_check_", false));
    }

    @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity
    public final void R1() {
        AppStartReporter.c(AppStartReporter.StartMethod.DEEPLINK, false, this, new l93(), false);
    }

    @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 421) {
            if (i3 == -1) {
                startActivity(new Intent(getApplicationContext(), (Class<?>) MainActivity.class));
            }
            finish();
        }
    }

    @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = LogoutReceiver.a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.i.b();
        super.onDestroy();
    }

    /* compiled from: LinkRedirActivity.kt */
    /* loaded from: classes7.dex */
    public final class c implements BaseLinkRedirectActivity.c {
        public boolean a;

        public c() {
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return this.a;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        
            if (r0.equals(r8) != false) goto L75;
         */
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Context context, Intent intent) {
            boolean z;
            Uri data = intent.getData();
            String str = null;
            boolean equals = "vklink".equals(data != null ? data.getScheme() : null);
            LinkRedirActivity linkRedirActivity = LinkRedirActivity.this;
            if (equals) {
                Uri data2 = intent.getData();
                if (data2 == null) {
                    this.a = true;
                    return;
                }
                String str2 = ((String[]) n6j.a(2, "\\?", data2.toString()).toArray(new String[0]))[1];
                linkRedirActivity.h = "internal".equals(data2.getHost());
                String stringExtra = intent.getStringExtra("token");
                if (linkRedirActivity.h) {
                    int i = e4y0.a;
                    if (stringExtra != null) {
                        StringBuilder sb = new StringBuilder();
                        String str3 = "";
                        sb.append(Preference.l().getString("xsrf_secret", ""));
                        sb.append((Object) str2);
                        try {
                            str3 = e4y0.a(MessageDigest.getInstance("SHA1").digest(sb.toString().getBytes(C.UTF8_NAME)));
                        } catch (Exception unused) {
                        }
                    }
                    this.a = true;
                    return;
                }
                try {
                    z = naz.j(Uri.parse(str2));
                } catch (Throwable unused2) {
                    z = false;
                }
                if (!z) {
                    L.l(go9.b("disallow open not vk link ", str2));
                    this.a = true;
                    return;
                }
            }
            String valueOf = String.valueOf(intent.getData());
            int length = valueOf.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                char charAt = valueOf.charAt(!z2 ? i2 : length);
                boolean z3 = ro.j(charAt) || charAt == 8203 || charAt == 8204 || charAt == 8205 || charAt == 8288 || charAt == 65279;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            String obj = valueOf.subSequence(i2, length + 1).toString();
            boolean booleanExtra = intent.getBooleanExtra("from_notification", false);
            ui70 d = z4g.d();
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            d.J(context2, intent);
            boolean booleanExtra2 = intent.getBooleanExtra("no_browser", false);
            String stringExtra2 = intent.hasExtra("ref") ? intent.getStringExtra("ref") : null;
            Document document = (Document) intent.getParcelableExtra("document");
            LaunchContext.a aVar = new LaunchContext.a();
            aVar.a = booleanExtra;
            aVar.b = booleanExtra2;
            aVar.c = linkRedirActivity.h;
            aVar.d = stringExtra2;
            aVar.f = document;
            aVar.j = o25.a().b();
            aVar.l = LaunchContext.ActivityNextState.FINISH;
            aVar.h = obj;
            if (linkRedirActivity.getReferrer() != null) {
                String host = linkRedirActivity.getReferrer().getHost();
                String packageName = j6i.a().g().getPackageName();
                if (host != null && host.equals(packageName)) {
                    str = host;
                }
            }
            aVar.e = str;
            LaunchContext a2 = aVar.a();
            linkRedirActivity.k.f(intent, "open_music");
            this.a = !xwk.d().e().l(context, obj, a2, intent.getExtras(), new a(linkRedirActivity, this, intent, intent.getBooleanExtra("__source_from_shortcut", false), a2, context, obj));
        }

        /* compiled from: LinkRedirActivity.kt */
        public static final class a implements yp80 {
            public final /* synthetic */ LinkRedirActivity b;
            public final /* synthetic */ c c;
            public final /* synthetic */ Intent d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ LaunchContext f;
            public final /* synthetic */ Context g;
            public final /* synthetic */ String h;

            public a(LinkRedirActivity linkRedirActivity, c cVar, Intent intent, boolean z, LaunchContext launchContext, Context context, String str) {
                this.b = linkRedirActivity;
                this.c = cVar;
                this.d = intent;
                this.e = z;
                this.f = launchContext;
                this.g = context;
                this.h = str;
            }

            @Override // xsna.yp80
            public final void U() {
                LaunchContext launchContext = this.f;
                if (!launchContext.b) {
                    xwk.d().getBrowser().f(this.g, null, launchContext, this.h);
                }
                LinkRedirActivity linkRedirActivity = this.b;
                linkRedirActivity.overridePendingTransition(0, 0);
                linkRedirActivity.finish();
            }

            @Override // xsna.yp80
            public final void onError(Throwable th) {
                LaunchContext launchContext = this.f;
                boolean z = launchContext.b;
                LinkRedirActivity linkRedirActivity = this.b;
                if (!z) {
                    if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) {
                        enj.q(R.string.access_error, 0, linkRedirActivity);
                    } else if (!(th instanceof PostNotFoundException) && !(th instanceof ClipNotFoundException)) {
                        xwk.d().getBrowser().f(this.g, null, launchContext, this.h);
                    }
                }
                linkRedirActivity.overridePendingTransition(0, 0);
                linkRedirActivity.finish();
            }

            @Override // xsna.yp80
            public final void onSuccess() {
                LinkRedirActivity linkRedirActivity = this.b;
                linkRedirActivity.overridePendingTransition(0, 0);
                linkRedirActivity.setResult(-1);
                Bundle extras = this.d.getExtras();
                if (extras != null) {
                    long j = extras.getLong("START_OPEN_TIME_PARAM", 0L);
                    if (j > 0) {
                        ((pbw) LinkRedirActivity.this.j.getValue()).e().a(SystemClock.elapsedRealtime() - j);
                    }
                }
                if (this.e) {
                    UiTracker.e.b(null);
                } else {
                    UiTracker.e.getClass();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    uzp0Var.b = uzp0.a.LINK;
                }
                linkRedirActivity.finish();
            }

            @Override // xsna.yp80
            public final void I() {
            }

            @Override // xsna.yp80
            public final void B0(boolean z) {
            }
        }
    }
}
