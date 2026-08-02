package xsna;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.google.common.collect.ImmutableList;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.photos.root.presentation.a;
import com.vk.photos.root.tabs.PhotosRootTab;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.hit;
import xsna.ihz;
import xsna.jza0;
import xsna.mts;
import xsna.npl;
import xsna.qlh;
import xsna.xgy;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z8 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, xgy.a, VkTooltip.b, pcs, Preference.c, npl.h.a, ihz.a, c.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.npl.h.a
    public com.google.common.collect.g a(int i, pfp0 pfp0Var, int[] iArr) {
        npl.d dVar = (npl.d) this.c;
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i2 = 0; i2 < pfp0Var.a; i2++) {
            aVar.c(new npl.b(i, pfp0Var, i2, dVar, iArr[i2]));
        }
        return aVar.g();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((y8) obj2).invoke(obj);
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 11:
            case 12:
            case 15:
            case 23:
            default:
                return (List) ((t3v) obj2).invoke(obj);
            case 5:
                return (Pair) ((defpackage.m) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.e) ((vw4) obj2).invoke(obj);
            case 7:
                return (vsf) ((izs) obj2).invoke(obj);
            case 8:
                return ((qlh.b) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.e) ((x1j) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((n82) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((y8) obj2).invoke(obj);
            case 16:
                return (ptk) ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
            case 17:
                return (gcp) ((hit.a) obj2).invoke(obj);
            case 18:
                return (xav) ((ui) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((x620) obj2).invoke(obj);
            case 20:
                return (Boolean) ((x620) obj2).invoke(obj);
            case 21:
                int i2 = MsgViewFragment.i0;
                return (MsgFromUser) ((x620) obj2).invoke(obj);
            case 22:
                return (tt70) ((x620) obj2).invoke(obj);
            case 24:
                return (VKList) ((lxz) obj2).invoke(obj);
            case 25:
                AtomicInteger atomicInteger = PopupStickerView.q;
                return (Map) ((x620) obj2).invoke(obj);
            case 26:
                return (Group) ((lxz) obj2).invoke(obj);
            case 27:
                return (List) ((x620) obj2).invoke(obj);
            case 28:
                return (Boolean) ((cd10) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
        ((cfd) this.c).P0 = null;
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, final int i) {
        final com.vk.photos.root.presentation.h hVar = (com.vk.photos.root.presentation.h) this.c;
        PhotosRootTab photosRootTab = null;
        lga0 lga0Var = new lga0(hVar.b, null, 0);
        lga0Var.getTextView().setLetterSpacing(0.01f);
        lga0Var.getCardView().setMinimumWidth(cn70.b(84));
        lga0Var.setOnClickListener(new View.OnClickListener() { // from class: xsna.nga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.vk.photos.root.presentation.h.this.d.invoke(new a.e(i));
            }
        });
        PhotosRootTab.Companion.getClass();
        PhotosRootTab[] values = PhotosRootTab.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            PhotosRootTab photosRootTab2 = values[i2];
            if (photosRootTab2.h() == i) {
                photosRootTab = photosRootTab2;
                break;
            }
            i2++;
        }
        if (photosRootTab != null) {
            lga0Var.setText(lga0Var.getContext().getString(photosRootTab.i()));
        }
        boolean z = i == 0;
        awt0.x(lga0Var, z ? cn70.b(5) : cn70.b(2), 0, cn70.b(z ? 2 : 4), cn70.b(8), 2);
        gVar.l(lga0Var);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        Context mo2getContext = debugDevSettingsFragment.mo2getContext();
        if (mo2getContext != null) {
            UserId c = o25.a().c();
            io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yfb.x(mts.a.a((982 & 1) != 0 ? null : c, null, null, (982 & 8) != 0 ? null : 4, null, e43.l(UsersFieldsDto.PHOTO, UsersFieldsDto.PHOTO_BASE), null, null)));
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = T.r0(asu0.t()).a0(asu0Var.d());
            m1r m1rVar = new m1r(new nkc(mo2getContext, 2), 12);
            int i = kwg0.a;
            a0.subscribe(m1rVar, new iwg0());
        }
        return true;
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        Insets insets;
        int i;
        oob oobVar = (oob) this.c;
        int i2 = ify.a;
        int c = ify.c(oobVar.k.getApplicationContext(), null);
        if (!gz80.a(30)) {
            return c;
        }
        a1w a1wVar = oobVar.b;
        a1wVar.getClass();
        if (!a1wVar.r().h.l()) {
            return c;
        }
        View view = oobVar.r;
        insets = (view != null ? view : null).getRootWindowInsets().getInsets(519);
        i = insets.bottom;
        return c - i;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).d((ukk) this.c);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
        int i = CommunityReviewsFragment.o0;
        String l = fpf0.a(PinReviewDetailsScreenResult.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable(l, PinReviewDetailsScreenResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable(l);
            if (!(parcelable3 instanceof PinReviewDetailsScreenResult)) {
                parcelable3 = null;
            }
            parcelable = (PinReviewDetailsScreenResult) parcelable3;
        }
        xn50.a.c(communityReviewsFragment, new c.r.f((PinReviewDetailsScreenResult) parcelable));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i2 = AsrRecordStartFragment.U;
                return ((Boolean) ((y8) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ddd) obj2).invoke(obj)).booleanValue();
        }
    }
}
