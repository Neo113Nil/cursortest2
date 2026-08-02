package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.widget.TextView;
import android.widget.Toast;
import com.ironsource.C4217a2;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vk.reefton.Reef;
import com.vk.rlottie.RLottieDrawable;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.cmx0;
import xsna.ghc0.f;
import xsna.sw50;
import xsna.vnx0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m960 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m960(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        cmx0 cmx0Var;
        switch (this.b) {
            case 0:
                com.vk.superapp.widget_settings.p004new.a aVar = (com.vk.superapp.widget_settings.p004new.a) this.c;
                int i = com.vk.superapp.widget_settings.p004new.a.n1;
                vnx0.a aVar2 = new vnx0.a(WidgetSettingsModalOpenSource.ERROR_DIALOG);
                aVar.getClass();
                xn50.a.c(aVar, aVar2);
                return s3q0.a;
            case 1:
                ol60 ol60Var = (ol60) this.c;
                return Long.valueOf(((ol60Var.b & 65535) << 48) | ((65535 & ol60Var.h()) << 32) | (ol60Var.f() & 4294967295L));
            case 2:
                return (StoriesComponent) ((mo60) this.c).c().a(fpf0.a(StoriesComponent.class));
            case 3:
                NewsfeedMappersComponentImpl newsfeedMappersComponentImpl = (NewsfeedMappersComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedMappersComponentImpl.o;
                return new r9x0(newsfeedMappersComponentImpl.a9(), newsfeedMappersComponentImpl.xc());
            case 4:
                Toast.makeText((Context) this.c, R.string.video_live_do_not_notify_toast, 0).show();
                return s3q0.a;
            case 5:
                RLottieDrawable rLottieDrawable = ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) this.c).C;
                if (rLottieDrawable != null) {
                    rLottieDrawable.j();
                }
                return s3q0.a;
            case 6:
                return ((po80) this.c).b.b;
            case 7:
                m8a0 m8a0Var = (m8a0) this.c;
                int i2 = m8a0.v1;
                return m8a0Var.bo().d3();
            case 8:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) this.c;
                ArrayList b = photoVideoAttachActivity.v.b();
                FragmentImpl f = photoVideoAttachActivity.n().f(R.id.fl_container);
                if (f instanceof GalleryFragmentImpl) {
                    ((GalleryFragmentImpl) f).ij(b, null, new hd4(photoVideoAttachActivity, 4));
                }
                return s3q0.a;
            case 9:
                return ((ClassifiedsComponent) ((k7m) m7m.f((y1c0) this.c)).a(fpf0.a(ClassifiedsComponent.class))).dc();
            case 10:
                PostFragment postFragment = (PostFragment) this.c;
                int i3 = PostFragment.S0;
                return ((AttachmentMappersComponent) m7m.d(postFragment).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 11:
                PostSettingsFragment postSettingsFragment = (PostSettingsFragment) this.c;
                int i4 = PostSettingsFragment.Y;
                return new ucb(new l500(postSettingsFragment, 27));
            case 12:
                return ((rbc0) this.c).a.getString("business_onboarding_tooltip", null);
            case 13:
                return ((ghc0) this.c).new f();
            case 14:
                dzc0 dzc0Var = (dzc0) this.c;
                gsw gswVar = new gsw(dzc0Var.b);
                jgp jgpVar = jgp.b;
                SharedPreferences sharedPreferences = dzc0Var.a;
                long j = sharedPreferences.getLong("expiry", 0L);
                long j2 = sharedPreferences.getLong("taken", 0L);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > j || j2 > elapsedRealtime) {
                    cmx0Var = cmx0.d.a;
                } else {
                    String string = sharedPreferences.getString("state", "unknown");
                    if (string != null) {
                        int hashCode = string.hashCode();
                        if (hashCode != -1609594047) {
                            if (hashCode == 270940796 && string.equals(C4217a2.e)) {
                                cmx0Var = new cmx0.a(jgpVar);
                            }
                        } else if (string.equals("enabled")) {
                            cmx0Var = new cmx0.b(jgpVar);
                        }
                    }
                    cmx0Var = cmx0.d.a;
                }
                gswVar.b(cmx0Var);
                gswVar.c.set(sharedPreferences.getLong("expiry", 0L));
                return gswVar;
            case 15:
                ((kxw) this.c).b.invoke(Boolean.TRUE);
                return s3q0.a;
            case 16:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) this.c;
                int[] iArr = PrivacyEditFragment.W0;
                sw50.n c = rwi.d().c();
                ArrayList<UserProfile> arrayList = privacyEditFragment.M0.c;
                int size = arrayList == null ? 0 : arrayList.size();
                UserId[] userIdArr = new UserId[size];
                for (int i5 = 0; i5 < size; i5++) {
                    userIdArr[i5] = arrayList.get(i5).c;
                }
                c.b(privacyEditFragment, userIdArr, R.string.privacy_denied_to, 102);
                return null;
            case 17:
                vkd0 vkd0Var = (vkd0) this.c;
                return new zjd0(vkd0Var.a, vkd0Var.b);
            case 18:
                jzd0 jzd0Var = ((j1e0) this.c).g;
                if (jzd0Var != null) {
                    jzd0Var.a();
                }
                return s3q0.a;
            case 19:
                QRTypes$AddressBookQRAction.b bVar = (QRTypes$AddressBookQRAction.b) this.c;
                ArrayList arrayList2 = new ArrayList();
                QRTypes$AddressBookQRAction.a aVar3 = bVar.a;
                if (aVar3 != null) {
                    arrayList2.add(aVar3);
                }
                QRTypes$AddressBookQRAction.a aVar4 = bVar.b;
                if (aVar4 != null) {
                    arrayList2.add(aVar4);
                }
                QRTypes$AddressBookQRAction.a aVar5 = bVar.c;
                if (aVar5 != null) {
                    arrayList2.add(aVar5);
                }
                QRTypes$AddressBookQRAction.a aVar6 = bVar.d;
                if (aVar6 != null) {
                    arrayList2.add(aVar6);
                }
                QRTypes$AddressBookQRAction.a aVar7 = bVar.e;
                if (aVar7 != null) {
                    arrayList2.add(aVar7);
                }
                QRTypes$AddressBookQRAction.a aVar8 = bVar.f;
                if (aVar8 != null) {
                    arrayList2.add(aVar8);
                }
                QRTypes$AddressBookQRAction.a aVar9 = bVar.g;
                if (aVar9 != null) {
                    arrayList2.add(aVar9);
                }
                QRTypes$AddressBookQRAction.a aVar10 = bVar.h;
                if (aVar10 != null) {
                    arrayList2.add(aVar10);
                }
                QRTypes$AddressBookQRAction.a aVar11 = bVar.i;
                if (aVar11 != null) {
                    arrayList2.add(aVar11);
                }
                return arrayList2;
            case 20:
                ((b410) this.c).invoke();
                return s3q0.a;
            case 21:
                return (pbf0) this.c;
            case 22:
                vof0 vof0Var = (vof0) this.c;
                AtomicInteger atomicInteger = Reef.i;
                com.vk.reefton.c cVar = Reef.j;
                if (cVar == null) {
                    return s3q0.a;
                }
                vof0Var.a(new mof0(new r600(cVar.l.get(), cVar.c.get(), cVar.d.get(), cVar.e.get(), cVar.f.get(), cVar.g.get(), cVar.h.get(), cVar.i.get(), cVar.j.get(), cVar.k.get()), Long.valueOf(cVar.m.get())));
                return s3q0.a;
            case 23:
                ((s8g0) this.c).e();
                return s3q0.a;
            case 24:
                ((meh0) this.c).h.getClass();
                return Integer.valueOf(pnf.a());
            case 25:
                dz20 dz20Var = (dz20) this.c;
                if (dz20Var != null) {
                    dz20Var.Qc("GoodsPickerHelper");
                }
                return s3q0.a;
            case 26:
                return (TextView) ((noi0) this.c).findViewById(R.id.ecomm_service_cell_price);
            case 27:
                SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
                com.vk.metrics.eventtracking.b.a.a(new SettingsListFragment.c("Hire me! id=" + q6r0.f().y()));
                xwk.d().e().a(settingsListFragment.requireContext(), "https://" + a0a.d + "/jobs?w=job38");
                return s3q0.a;
            case 28:
                return Float.valueOf(((kih0) this.c).getPosition() / 1000.0f);
            default:
                SmartCropFragment smartCropFragment = (SmartCropFragment) this.c;
                qcy<Object>[] qcyVarArr2 = SmartCropFragment.Q;
                smartCropFragment.finish();
                return s3q0.a;
        }
    }
}
