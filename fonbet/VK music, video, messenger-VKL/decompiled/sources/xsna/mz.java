package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioReactionConfigDto;
import com.vk.api.generated.audio.dto.AudioReactionsConfigDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.music.reactions.Reaction;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.log.L;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import xsna.acs;
import xsna.bh7;
import xsna.egg0;
import xsna.fh8;
import xsna.ngd;
import xsna.rn4;
import xsna.tra0;
import xsna.xf8;
import xsna.xn50;
import xsna.xrb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CameraUIView cameraUIView;
        LinearLayout linearLayout;
        Object previous;
        int i = this.b;
        r5 = null;
        String str = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                WebApiApplication webApiApplication = (WebApiApplication) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int max = (int) (Math.max(bitmap.getWidth(), bitmap.getHeight()) * 0.2d);
                int i2 = max * 2;
                int width = bitmap.getWidth() + i2;
                int height = bitmap.getHeight() + i2;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(0);
                float f = max;
                canvas.drawBitmap(bitmap, f, f, (Paint) null);
                PorterDuff.Mode mode = IconCompat.k;
                createBitmap.getClass();
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.b = createBitmap;
                break;
            case 1:
                nu1 nu1Var = (nu1) obj2;
                int i3 = nu1.n1;
                xrb0.e eVar = xrb0.e.b;
                nu1Var.getClass();
                xn50.a.c(nu1Var, eVar);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                tra0.a aVar = (tra0.a) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    tra0.a.x(aVar, (tra0) arrayList.get(i4), 0, 0);
                }
                break;
            case 3:
                int i5 = AppearanceSettingsWithBackgroundsFragment.b0;
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) ((WeakReference) obj2).get();
                if (appearanceSettingsWithBackgroundsFragment != null) {
                    defpackage.g gVar = new defpackage.g(appearanceSettingsWithBackgroundsFragment, 4);
                    Lifecycle lifecycle = appearanceSettingsWithBackgroundsFragment.getLifecycle();
                    lifecycle.addObserver(new sc3(lifecycle, gVar));
                }
                break;
            case 4:
                ((b94) obj2).i.a = (AttachmentsArrangementConfig) obj;
                break;
            case 5:
                ((io.reactivex.rxjava3.core.r) obj2).onNext(new rn4.a(((Float) obj).floatValue()));
                break;
            case 6:
                AudioReactionsConfigDto audioReactionsConfigDto = (AudioReactionsConfigDto) obj;
                xt4 xt4Var = (xt4) ((ju4) obj2).b;
                String title = audioReactionsConfigDto.getTitle();
                if (title == null) {
                    title = "";
                }
                String e = audioReactionsConfigDto.e();
                String str2 = e != null ? e : "";
                List<AudioReactionConfigDto> d = audioReactionsConfigDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (AudioReactionConfigDto audioReactionConfigDto : d) {
                    arrayList2.add(new Reaction(audioReactionConfigDto.getId(), audioReactionConfigDto.getTitle(), audioReactionConfigDto.getDescription(), audioReactionConfigDto.d(), audioReactionConfigDto.e()));
                }
                break;
            case 7:
                lj5 lj5Var = (lj5) obj2;
                shh0 shh0Var = (shh0) obj;
                float f2 = shh0Var.b;
                PointF pointF = shh0Var.c;
                gp6 gp6Var = shh0Var.a;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    mwo0 mwo0Var = lj5Var.a;
                    ywo0 ywo0Var = mwo0Var.d;
                    if ((ywo0Var.a > 0 || lj5Var.b(pointF)) && (ywo0Var.a < ywo0Var.c || lj5Var.a(pointF))) {
                        int i6 = lj5Var.c;
                        if (i6 == 0) {
                            i6 = lj5.k;
                        }
                        long c = ywo0Var.r.c(gp6Var.q()) + gp6Var.H();
                        if (c == 0 && lj5Var.a(pointF)) {
                            ywo0Var.k(-i6, 0);
                        } else if (gp6Var.getDuration() + c == ywo0Var.e && lj5Var.b(pointF)) {
                            ywo0Var.k(i6, 0);
                        }
                        mwo0Var.e.a(gp6Var);
                        mwo0Var.a();
                        int i7 = ywo0Var.a;
                        if (i7 != 0 && i7 != ywo0Var.c) {
                            lj5Var.d.a(new shh0(gp6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pointF));
                        }
                    }
                } else {
                    acs.a aVar2 = lj5Var.b;
                    int i8 = lj5.l;
                    int i9 = lj5.m;
                    float f3 = gp6Var.u().left;
                    float f4 = lj5.i;
                    float f5 = f3 - f4;
                    mwo0 mwo0Var2 = lj5Var.a;
                    ywo0 ywo0Var2 = mwo0Var2.d;
                    gc00 gc00Var = mwo0Var2.e;
                    RectF rectF = ywo0Var2.o;
                    if (f5 < rectF.left && ywo0Var2.a > 0 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && lj5Var.a(pointF)) {
                        int min = Math.min(i9, Math.max(((int) Math.abs(gp6Var.u().left)) / 50, i8));
                        lj5Var.c = min;
                        if (((Boolean) aVar2.invoke(new nxm(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF, gp6Var, Boolean.TRUE)).booleanValue()) {
                            ywo0Var2.k(-min, 0);
                            gc00Var.a(gp6Var);
                            mwo0Var2.a();
                        }
                    } else if (gp6Var.u().right + f4 > rectF.right && ywo0Var2.a < ywo0Var2.c && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && lj5Var.b(pointF)) {
                        int min2 = Math.min(i9, Math.max(((int) (gp6Var.u().right - rectF.right)) / 50, i8));
                        lj5Var.c = min2;
                        if (((Boolean) aVar2.invoke(new nxm(-min2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF, gp6Var, Boolean.TRUE)).booleanValue()) {
                            ywo0Var2.k(min2, 0);
                            gc00Var.a(gp6Var);
                            mwo0Var2.a();
                        }
                    }
                }
                break;
            case 8:
                final com.vk.auth.verification.base.a aVar3 = (com.vk.auth.verification.base.a) obj2;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 9:
                UserItem userItem = (UserItem) obj;
                pud0 pud0Var = (pud0) ((al6) obj2).a;
                if (pud0Var != null) {
                    pud0Var.al(userItem);
                }
                break;
            case 10:
                ((zak0) ((bh7) obj2).e).setValue((bh7.b) obj);
                break;
            case 11:
                ((BonusCatalogFragment) obj2).io();
                break;
            case 12:
                BotButton.Link link = (BotButton.Link) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(link.g.h()), "type");
                w9yVar.e(link.h, "payload");
                w9yVar.c(Integer.valueOf(link.i), TtmlNode.TAG_SPAN);
                w9yVar.e(link.j, "key");
                w9yVar.e(link.k, "link");
                w9yVar.c(Integer.valueOf(link.l.h()), "color_id");
                w9yVar.b(Boolean.valueOf(link.m), "inline");
                w9yVar.d(Long.valueOf(link.n.b), "author");
                break;
            case 13:
                zjw0 zjw0Var = (zjw0) obj2;
                zjw0Var.d.invoke(((xf8.f) obj).a);
                zjw0Var.b.a(fh8.n.a);
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                l2l<CameraBounds> l2lVar = ((vf9) obj2).a;
                if (l2lVar != null) {
                    L.e(new Object[0]);
                    l2lVar.d = true;
                }
                break;
            case 17:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) obj2).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                break;
            case 18:
                com.vk.cameraui.impl.a aVar4 = (com.vk.cameraui.impl.a) obj2;
                Bitmap bitmap2 = (Bitmap) ((it80) obj).a;
                if (bitmap2 != null && (linearLayout = (cameraUIView = aVar4.b).S0) != null) {
                    cameraUIView.o0(1.0f, linearLayout.getChildCount() - 1);
                    lk9 lk9Var = new lk9(cameraUIView.getContext());
                    lk9Var.setLayoutParams(new ViewGroup.LayoutParams(e3m.a(R.dimen.camera_preview_width, lk9Var.getContext()), e3m.a(R.dimen.camera_preview_height, lk9Var.getContext())));
                    lk9Var.setBitmap(bitmap2);
                    lk9Var.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    linearLayout.addView(lk9Var);
                    HorizontalScrollView horizontalScrollView = cameraUIView.R0;
                    if (horizontalScrollView != null) {
                        horizontalScrollView.smoothScrollTo(Integer.MAX_VALUE, 0);
                    }
                }
                break;
            case 19:
                cu9 cu9Var = (cu9) obj2;
                izs<MoneyCard, s3q0> izsVar = cu9Var.p;
                it9 it9Var = cu9Var.r;
                izsVar.invoke((it9Var != null ? it9Var : null).c);
                break;
            case 20:
                break;
            case 21:
                ((i9b) obj2).l();
                break;
            case 22:
                ((usb) obj2).a.d();
                break;
            case 23:
                g2v.c().getClass();
                break;
            case 24:
                CheckoutFragment checkoutFragment = (CheckoutFragment) obj2;
                int i10 = CheckoutFragment.T;
                checkoutFragment.getClass();
                xn50.a.c(checkoutFragment, (r2c) obj);
                break;
            case 25:
                break;
            case 26:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) obj2;
                int i11 = ClipsAudioFragment.Y;
                ngd.g gVar2 = ngd.g.b;
                clipsAudioFragment.getClass();
                xn50.a.c(clipsAudioFragment, gVar2);
                break;
            case 27:
                dw20 dw20Var = ((ClipsAutoSubtitlesBottomSheet) obj2).b;
                if (dw20Var != null) {
                    String str3 = dw20.d1;
                    dw20Var.Sn(null);
                }
                break;
            case 28:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj2;
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                int size2 = m.size();
                if (size2 > 0) {
                    ListIterator<T> listIterator = ((egg0.a) m.iterator()).b;
                    if (listIterator.hasPrevious()) {
                        previous = listIterator.previous();
                        if (listIterator.hasPrevious()) {
                            int i12 = ((ClipsDraftVk) previous).b.h;
                            do {
                                Object previous2 = listIterator.previous();
                                int i13 = ((ClipsDraftVk) previous2).b.h;
                                if (i12 < i13) {
                                    previous = previous2;
                                    i12 = i13;
                                }
                            } while (listIterator.hasPrevious());
                        }
                    } else {
                        previous = null;
                    }
                    ClipsDraftVk clipsDraftVk = (ClipsDraftVk) previous;
                    if (clipsDraftVk != null) {
                        str = clipsDraftVk.b.j;
                    }
                }
                yVar.onSuccess(new gud(size2, str != null ? str : ""));
                break;
            default:
                eoe eoeVar = (eoe) obj2;
                h7d h7dVar = (h7d) obj;
                List<VideoFile> list = h7dVar.a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof ClipVideoFile) {
                        arrayList3.add(obj3);
                    }
                }
                PaginationKey paginationKey = h7dVar.c;
                qcy<Object>[] qcyVarArr = eoe.j;
                eoeVar.a(arrayList3, paginationKey, false);
                break;
        }
        return s3q0.a;
    }
}
