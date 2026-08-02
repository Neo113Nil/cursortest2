package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.preference.TwoStatePreference;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.ironsource.Be;
import com.ironsource.C4281dc;
import com.ironsource.Ce;
import com.ironsource.Ve;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vkontakte.android.R;
import java.util.SimpleTimeZone;
import org.webrtc.EglThread;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import xsna.k5x;
import xsna.kmz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dw20 dw20Var = ((rd0) this.c).d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            case 1:
                mhy.d(((BaseVkSearchView) this.c).w);
                break;
            case 2:
                Be.b((Be) this.c);
                break;
            case 3:
                Ce.b((Ve) this.c);
                break;
            case 4:
                RichEditText richEditText = (RichEditText) this.c;
                ((InputMethodManager) richEditText.getContext().getSystemService("input_method")).showSoftInput(richEditText, 1);
                richEditText.post(new pxq());
                break;
            case 5:
                androidx.media3.exoplayer.audio.d dVar = (androidx.media3.exoplayer.audio.d) this.c;
                if (dVar.a0 >= 300000) {
                    androidx.media3.exoplayer.audio.f.this.T0 = true;
                    dVar.a0 = 0L;
                    break;
                }
                break;
            case 6:
                rsl.c((rsl) this.c);
                break;
            case 7:
                ((EglThread) this.c).lambda$onRenderWindowOpen$2();
                break;
            case 8:
                nij nijVar = ((m3r) this.c).g;
                if (nijVar != null) {
                    nijVar.invoke();
                    break;
                }
                break;
            case 9:
                ((k5x.b) this.c).setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 10:
                kmz kmzVar = (kmz) this.c;
                kmz.a aVar = kmzVar.c;
                if (aVar instanceof kmz.a.d) {
                    long j = ((kmz.a.d) aVar).a;
                    SimpleTimeZone simpleTimeZone = pvo0.a;
                    xuo0.a.getClass();
                    long a = j - xuo0.a();
                    kmzVar.b(Integer.valueOf(R.drawable.vk_icon_play_24), Integer.valueOf(R.string.topshelf_time_before_start), pvo0.b((a >= 0 ? a : 0L) / 1000));
                    ((Handler) kmzVar.e.getValue()).postDelayed((Runnable) kmzVar.f.getValue(), 1000L);
                    break;
                }
                break;
            case 11:
                MaterialPreferenceFragment materialPreferenceFragment = MaterialPreferenceFragment.this;
                TwoStatePreference twoStatePreference = (TwoStatePreference) materialPreferenceFragment.c0;
                if (twoStatePreference != null) {
                    twoStatePreference.O(materialPreferenceFragment.Z);
                }
                materialPreferenceFragment.fo();
                break;
            case 12:
                ((MediaConnectionManagerImpl) this.c).noDataCallbackTimeout();
                break;
            case 13:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.c;
                cVar.b = false;
                SideSheetBehavior sideSheetBehavior = cVar.d;
                zut0 zut0Var = sideSheetBehavior.j;
                if (zut0Var != null && zut0Var.h()) {
                    cVar.a(cVar.a);
                    break;
                } else if (sideSheetBehavior.i == 2) {
                    sideSheetBehavior.E(cVar.a);
                    break;
                }
                break;
            case 14:
                SimpleDialogsFilterFragment simpleDialogsFilterFragment = (SimpleDialogsFilterFragment) this.c;
                qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
                simpleDialogsFilterFragment.ho();
                break;
            case 15:
                qpk0 qpk0Var = (qpk0) this.c;
                if (qpk0Var.b > 0) {
                    int floor = (int) Math.floor(qpk0Var.d);
                    int ceil = (int) Math.ceil(5.0f - qpk0Var.d);
                    float f = floor;
                    boolean z = qpk0Var.d - f >= 0.2f;
                    try {
                        int i = qpk0Var.b;
                        int i2 = (int) ((i + qpk0Var.c) * 5.0f);
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        qpk0Var.e = Bitmap.createBitmap(i2, i, config);
                        Canvas canvas = new Canvas(qpk0Var.e);
                        int i3 = qpk0Var.b;
                        Paint paint = qpk0.g;
                        paint.setColor(-552162);
                        canvas.drawPath(qpk0Var.a(i3 / 2, 0, floor), paint);
                        int i4 = (int) (((qpk0Var.b + qpk0Var.c) * f) + 0);
                        paint.setColor(-3355444);
                        canvas.drawPath(qpk0Var.a(r11 / 2, i4, ceil), paint);
                        if (z) {
                            int i5 = qpk0Var.b;
                            double d = qpk0Var.d;
                            float floor2 = (float) (d - Math.floor(d));
                            paint.setColor(-552162);
                            Path a2 = qpk0Var.a(i5 / 2, 0, 1);
                            float f2 = i5 * floor2;
                            Rect rect = new Rect(i4, 0, (int) (i4 + f2), i5);
                            Bitmap createBitmap = Bitmap.createBitmap((int) f2, i5, config);
                            new Canvas(createBitmap).drawPath(a2, paint);
                            canvas.drawBitmap(createBitmap, (Rect) null, rect, paint);
                        }
                        qpk0Var.invalidate();
                        qpk0Var.f = false;
                        break;
                    } catch (OutOfMemoryError unused) {
                        gu8.c(null, "StarsRatingView: Unable to create rating bitmap because of OOME");
                        return;
                    }
                }
                break;
            case 16:
                ((tyl0) this.c).d();
                break;
            case 17:
                VideoPlayerMode videoPlayerMode = (VideoPlayerMode) this.c;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                xh5 xh5Var = b.C1208b.a().c;
                Object obj = xh5Var != null ? xh5Var.a : null;
                VideoAutoPlay videoAutoPlay = obj instanceof VideoAutoPlay ? (VideoAutoPlay) obj : null;
                if (videoAutoPlay != null) {
                    i0q0.j(new tou(5, videoPlayerMode, videoAutoPlay));
                    break;
                }
                break;
            case 18:
                equ0 equ0Var = (equ0) this.c;
                equ0Var.X0();
                szv szvVar = equ0Var.r;
                if (szvVar.h()) {
                    Context context = equ0Var.m;
                    if (context == null) {
                        context = null;
                    }
                    if (szvVar.b(context)) {
                        fqu0 fqu0Var = new fqu0(1, equ0Var, equ0.class, "showContactsPromoWithContacts", "showContactsPromoWithContacts(Lcom/vk/im/ui/components/contacts/tasks/ContactsPromoInfoGet$ContactsPromoInfo;)V", 0);
                        a1w a1wVar = equ0Var.i;
                        mcj mcjVar = new mcj();
                        k5j0 k5j0Var = new k5j0(fqu0Var, 19);
                        int i6 = kwg0.a;
                        equ0Var.I0(a1wVar.E(equ0Var, mcjVar).subscribe(k5j0Var, new hwg0()));
                    } else {
                        gqu0 gqu0Var = equ0Var.n;
                        if (gqu0Var == null) {
                            gqu0Var = null;
                        }
                        View view = gqu0Var.i;
                        RectF rectF = view != null ? new RectF(bwt0.C(view)) : null;
                        if (rectF != null) {
                            ((rcj) equ0Var.p.getValue()).a(rectF, null, 0);
                        }
                    }
                    szvVar.i();
                    break;
                }
                break;
            case 19:
                View view2 = ((com.vk.superapp.verification.account.d) this.c).getView();
                if (view2 != null) {
                    view2.setVisibility(0);
                    break;
                }
                break;
            case 20:
                ((hcw0) this.c).a();
                break;
            case 21:
                ((r5y0) this.c).a.a();
                break;
            case 22:
                C4281dc.a((C4281dc) this.c);
                break;
            default:
                ((ru.mail.libverify.api.s) this.c).x();
                break;
        }
    }
}
