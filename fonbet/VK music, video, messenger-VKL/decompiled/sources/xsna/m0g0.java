package xsna;

import android.content.Context;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import one.video.gl.EGL14Utils;
import xsna.eh3;

/* compiled from: RepeatFunction.java */
/* loaded from: classes3.dex */
public final class m0g0 implements io.reactivex.rxjava3.functions.l, iui0, reg0, LevelPlayRewardedAdListener, dwz0 {
    public Object b;

    public /* synthetic */ m0g0(Object obj) {
        this.b = obj;
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getQueryParameter(CampaignEx.JSON_KEY_AD_Q);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        ((n0g0) this.b).c++;
        io.reactivex.rxjava3.core.q.T(new Object());
        return io.reactivex.rxjava3.core.q.B0(r3.b, TimeUnit.MILLISECONDS);
    }

    public String b() {
        Date date = (Date) this.b;
        int date2 = date.getDate();
        int month = date.getMonth();
        int year = date.getYear() + 1900;
        return y8g0.f(R.string.story_date_title, Integer.valueOf(date2), e43.a.getResources().getStringArray(R.array.vk_months_full)[month], Integer.valueOf(year));
    }

    public String c() {
        Date date = (Date) this.b;
        int hours = date.getHours();
        String valueOf = hours > 9 ? String.valueOf(hours) : lhg.a(hours, "0");
        int minutes = date.getMinutes();
        return y8g0.f(R.string.story_time_short_format, valueOf, minutes > 9 ? String.valueOf(minutes) : lhg.a(minutes, "0"));
    }

    public long d() {
        return ((Date) this.b).getTime();
    }

    public void e(long j) {
        ((fh3) this.b).O(new eh3.e(j));
    }

    public void f() {
        if (epx.f((EGLDisplay) this.b, EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglTerminate((EGLDisplay) this.b);
        EGL14Utils.a("eglTerminate", new int[0]);
        this.b = EGL14.EGL_NO_DISPLAY;
        EGL14.eglReleaseThread();
        EGL14Utils.a("eglReleaseThread", new int[0]);
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).e();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).f();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).h(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).g();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ((n2z) this.b).c(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ((n2z) this.b).b();
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
        n2z n2zVar = (n2z) this.b;
        n2zVar.a(levelPlayAdInfo.getAdNetwork(), String.valueOf(levelPlayAdInfo.getRevenue()));
        n2zVar.a.onCompleted();
    }

    @Override // xsna.iui0
    public void onSessionEnded(ssi0 ssi0Var, int i) {
        ((xi7) this.b).d((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public void onSessionResumeFailed(ssi0 ssi0Var, int i) {
        ((xi7) this.b).d((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public void onSessionResumed(ssi0 ssi0Var, boolean z) {
        ((xi7) this.b).b((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
    }

    @Override // xsna.iui0
    public void onSessionStartFailed(ssi0 ssi0Var, int i) {
        ((xi7) this.b).d((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public void onSessionStarted(ssi0 ssi0Var, String str) {
        ((xi7) this.b).b((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionStarting(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.dwz0
    public Object zza() {
        return new r501((Context) ((mbl) ((cbb) this.b).c).b);
    }

    public m0g0(int i) {
        switch (i) {
            case 5:
                aj00 aj00Var = new aj00();
                this.b = aj00Var;
                if (aj00Var.c) {
                    return;
                }
                if (aj00Var.d) {
                    hxc0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                }
                aj00Var.a();
                aj00Var.d = true;
                return;
            case 6:
                this.b = msy.a(LazyThreadSafetyMode.NONE, new cy20(10));
                return;
            default:
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (epx.f(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                    throw new RuntimeException("Unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    throw new RuntimeException("Unable to initialize EGL14");
                }
                this.b = eglGetDisplay;
                return;
        }
    }
}
