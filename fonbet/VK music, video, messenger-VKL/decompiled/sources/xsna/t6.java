package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.exceptions.chat.ChatInvitationException;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.g;
import com.vk.log.L;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bonus.utils.BonusCatalogScrollHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.aiq0;
import xsna.ii8;
import xsna.ikv0;
import xsna.mwa;
import xsna.o2k;
import xsna.pta;
import xsna.tra0;
import xsna.xo3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t6(ActionFollowVh actionFollowVh, View view) {
        this.b = 2;
        this.c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.text.SpannableStringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.view.View, android.view.ViewGroup, com.vk.core.tool.view.vkblur.VkBlurContentView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gzs<s3q0> gzsVar;
        String str;
        int i = 6;
        int i2 = 13;
        int i3 = 12;
        boolean z = true;
        ?? r5 = 1;
        Object obj2 = null;
        int i4 = 0;
        switch (this.b) {
            case 0:
                g.a aVar = (g.a) this.c;
                ?? spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(" ");
                int f = e3m.f(R.attr.vk_ui_text_primary, aVar.itemView.getContext());
                SpannableString spannableString = new SpannableString(aVar.itemView.getContext().getString(R.string.more));
                spannableString.setSpan(new ForegroundColorSpan(f), 0, spannableString.length(), 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) spannableString);
                spannableStringBuilder.append(spannableStringBuilder2);
                return spannableStringBuilder;
            case 1:
                ((ja) this.c).a.wo();
                return s3q0.a;
            case 2:
                View view = (View) this.c;
                Throwable th = (Throwable) obj;
                L.i(th);
                i0q0.d(500L, new z6((int) (r5 == true ? 1 : 0), view, th));
                return s3q0.a;
            case 3:
                up1 up1Var = (up1) this.c;
                List<PhotosPhotoAlbumFullDto> d = ((PhotosGetAlbumsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto : d) {
                    ((tfa0) up1Var.c.getValue()).getClass();
                    arrayList.add(tfa0.a(photosPhotoAlbumFullDto));
                }
                return new VKList(arrayList);
            case 4:
                ((zak0) ((us1) this.c).f).setValue((tho0) obj);
                return s3q0.a;
            case 5:
                uc2 uc2Var = (uc2) this.c;
                uc2Var.e.e();
                return new cd2(uc2Var);
            case 6:
                ((wo3) this.c).T(new xo3.a.C4026a(new ewp((Throwable) obj)));
                return s3q0.a;
            case 7:
                tra0.a.x((tra0.a) obj, (tra0) this.c, 0, 0);
                return s3q0.a;
            case 8:
                pv4 pv4Var = (pv4) this.c;
                long longValue = ((Long) obj).longValue();
                TextView textView = pv4Var.m;
                if (textView == null) {
                    textView = null;
                }
                textView.setImportantForAccessibility(2);
                TextView textView2 = pv4Var.m;
                if (textView2 == null) {
                    textView2 = null;
                }
                long j = 60;
                textView2.setText(String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue / j), Long.valueOf(longValue % j)}, 2)));
                TextView textView3 = pv4Var.m;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setContentDescription(new coo(pv4Var.a).c((int) longValue));
                TextView textView4 = pv4Var.m;
                (textView4 != null ? textView4 : 0).setImportantForAccessibility(1);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(epx.f(Uri.fromFile(((mat0) obj).a), ((lo9) this.c).getVideoData().a));
            case 10:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) this.c;
                BonusCatalogScrollHelper bonusCatalogScrollHelper = bonusCatalogFragment.X;
                if (bonusCatalogScrollHelper == null) {
                    bonusCatalogScrollHelper = null;
                }
                bonusCatalogScrollHelper.getClass();
                BonusCatalogScrollHelper.d(bonusCatalogScrollHelper, 0, BonusCatalogScrollHelper.Snap.START, 20);
                com.vk.lists.c cVar = bonusCatalogFragment.W;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.p(false);
                Context requireContext = bonusCatalogFragment.requireContext();
                ikv0.a aVar2 = new ikv0.a(requireContext);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_done_circle_16, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) r6, i3);
                aVar2.u = new ikv0.d(requireContext.getString(R.string.stickers_bonus_catalog_buy_success), (String) r6, (ikv0.d.a) r6, i);
                aVar2.o = Integer.valueOf(cn70.b(8));
                aVar2.e = TimeUnit.SECONDS.toMillis(2L);
                aVar2.f = bonusCatalogFragment.getView();
                aVar2.p(bonusCatalogFragment.kn().getWindow());
                y9l0.a(p1l0.a);
                return s3q0.a;
            case 11:
                ((gp7) this.c).i.b = ((xwr) obj).h();
                return s3q0.a;
            case 12:
                hi8 hi8Var = (hi8) this.c;
                io.reactivex.rxjava3.subjects.f<ii8> fVar = hi8Var.d;
                if (hi8Var.f) {
                    ii8.b bVar = new ii8.b(hi8Var.g);
                    if (hi8Var.h) {
                        fVar.onNext(bVar);
                    }
                }
                ii8.a aVar3 = ii8.a.a;
                if (hi8Var.h) {
                    fVar.onNext(aVar3);
                }
                return s3q0.a;
            case 13:
                wh50 wh50Var = (wh50) this.c;
                Context context = (Context) obj;
                ?? vkBlurContentView = new VkBlurContentView(context, null, 6);
                wh50Var.setValue(vkBlurContentView);
                vkBlurContentView.setId(R.id.blur_content_view);
                bwt0.Z(R.attr.vk_ui_background, vkBlurContentView);
                VkImage vkImage = new VkImage(context, null, 6, 0);
                vkImage.setLayoutParams(cpy.a(-1, -1, 0, 0, 0, 0, 60));
                vkImage.setImageResource(R.drawable.ds_demo_image_1);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                vkBlurContentView.addView(vkImage);
                return vkBlurContentView;
            case 14:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 15:
                ((m8b) this.c).getClass();
                L.i((Throwable) obj);
                return s3q0.a;
            case 16:
                ((afb) this.c).b.c();
                return s3q0.a;
            case 17:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, (aeb) this.c, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -513, 7);
            case 18:
                DialogTheme dialogTheme = (DialogTheme) obj;
                com.vk.im.ui.components.msg_list.a aVar4 = ((ChatFragment) this.c).H0;
                com.vk.im.ui.components.msg_list.c cVar2 = (aVar4 != null ? aVar4 : null).O0;
                cVar2.getClass();
                cVar2.l(true, new wx0(i2, cVar2, dialogTheme));
                return s3q0.a;
            case 19:
                xyb xybVar = (xyb) this.c;
                ChatInvitationException chatInvitationException = ((esb) obj).a;
                if (chatInvitationException != null && xybVar.A != null) {
                    zk70.e(chatInvitationException);
                }
                return s3q0.a;
            case 20:
                thd thdVar = (thd) this.c;
                UserId userId = (UserId) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = thdVar.f;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                thdVar.f = new io.reactivex.rxjava3.internal.operators.single.j(thdVar.a.a().K(), new shd(thdVar, i4)).subscribe(new ia(new k22(4, thdVar, userId), i3), new js1(new lt0(16), i2));
                return s3q0.a;
            case 21:
                UserId userId2 = (UserId) this.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (epx.f(((uee) obj3).a.b, userId2)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 22:
                com.vk.preview.presentation.view.a aVar5 = (com.vk.preview.presentation.view.a) this.c;
                Iterator it = aVar5.y.getCurrentList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((a8f) next).b != null) {
                            obj2 = next;
                        }
                    }
                }
                if (obj2 != null && (gzsVar = aVar5.A) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                ((iqf) this.c).C((npf) obj);
                return s3q0.a;
            case 24:
                VkImage vkImage2 = (VkImage) obj;
                Thumb Jb = ((MusicTrack) this.c).Jb();
                if (Jb != null) {
                    int width = vkImage2.getWidth();
                    Serializer.c<Thumb> cVar4 = Thumb.CREATOR;
                    str = Jb.Ab(width, false);
                } else {
                    str = null;
                }
                vkImage2.o0(str, null);
                return s3q0.a;
            case 25:
                fkh fkhVar = (fkh) this.c;
                dl1 dl1Var = (dl1) obj;
                if (dl1Var instanceof cl1) {
                    z = epx.f(((cl1) dl1Var).a.c, fkhVar.a);
                } else if (dl1Var instanceof ok1) {
                    z = epx.f(((ok1) dl1Var).b, fkhVar.a);
                } else if (!(dl1Var instanceof bf1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 26:
                return kn00.a((kn00) obj, null, (xrh) this.c, null, 0, null, null, null, 2043);
            case 27:
                mwj mwjVar = (mwj) this.c;
                mwjVar.l.invoke(Integer.valueOf(mwjVar.getBindingAdapterPosition()));
                return s3q0.a;
            case 28:
                ((yzj) this.c).b.e2(new aiq0.d.a(new pta.a.b((o2k.b) obj)));
                return s3q0.a;
            default:
                ((xak) this.c).y0();
                return s3q0.a;
        }
    }

    public /* synthetic */ t6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
