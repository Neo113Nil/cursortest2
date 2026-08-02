package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.avatarchange.AvatarChangeCropFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import com.vk.im.ui.components.chat_profile.a;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.bm6;
import xsna.bp9;
import xsna.ca9;
import xsna.h75;
import xsna.kq1;
import xsna.oap;
import xsna.qy3;
import xsna.ry;
import xsna.tj50;
import xsna.uuq;
import xsna.uxd0;
import xsna.zg8;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (xsna.m0c.a(com.vk.im.engine.models.contacts.Contact.LastSeenStatus.a.a(r3)) != false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v124, types: [xsna.j8i, xsna.smb$a] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        h6f0 h6f0Var;
        bm9 presenter;
        bm9 presenter2;
        int i = this.b;
        int i2 = 7;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tj50.a aVar = (tj50.a) obj;
                x7 x7Var = new x7((ky) obj2, i3);
                ao8 ao8Var = ao8.d;
                return new ry.b(aVar.a(x7Var, ao8Var), aVar.a(new pt(i3), ao8Var));
            case 1:
                TextView textView = (TextView) obj2;
                int i4 = ym0.k1;
                if (((Boolean) obj).booleanValue()) {
                    bwt0.p0(textView, false);
                } else {
                    bwt0.p0(textView, true);
                    textView.setText(R.string.voip_session_room_admin_room_error_room_exists);
                }
                return s3q0.a;
            case 2:
                ((cq1) obj2).k.b(new kq1.c((Throwable) obj));
                return s3q0.a;
            case 3:
                com.vk.profile.questions.impl.a aVar2 = (com.vk.profile.questions.impl.a) obj2;
                Editable editable = (Editable) obj;
                if (editable != null) {
                    int i5 = com.vk.profile.questions.impl.a.o1;
                    sua.s(editable);
                }
                mjr mjrVar = aVar2.j1;
                if (mjrVar != null) {
                    mjrVar.c = String.valueOf(editable);
                    mjrVar.b();
                }
                return s3q0.a;
            case 4:
                return Boolean.valueOf(epx.f(((StoriesContainer) obj).Ab(), ((StoriesContainer) obj2).Ab()));
            case 5:
                qy3 qy3Var = (qy3) obj2;
                qy3.a.C3581a c3581a = (qy3.a.C3581a) obj;
                float f = c3581a.a;
                float f2 = f - qy3Var.f;
                float f3 = c3581a.b;
                float f4 = f3 - qy3Var.g;
                qy3Var.f = f;
                qy3Var.g = f3;
                return new Pair(Float.valueOf(f2), Float.valueOf(f4));
            case 6:
                Throwable th = (Throwable) obj;
                bn40.c(th, new Object[0]);
                ((m7) obj2).invoke(th);
                return s3q0.a;
            case 7:
                return AuthorState.a((AuthorState) obj, ((h75.a) obj2).b, null, 13);
            case 8:
                ((dnt0) obj2).setVideoFocused(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 9:
                AvatarChangeCropFragment avatarChangeCropFragment = (AvatarChangeCropFragment) obj2;
                avatarChangeCropFragment.S = (Bitmap) obj;
                avatarChangeCropFragment.eo();
                return s3q0.a;
            case 10:
                Throwable th2 = (Throwable) obj;
                ((r46) obj2).k(new uxd0.w(th2));
                L.g("ProfileInfoModel", th2);
                return s3q0.a;
            case 11:
                return VKList.p((VKList) obj, new x7((wj6) obj2, 9));
            case 12:
                bm6 bm6Var = (bm6) obj2;
                ListDataSet<g6f0> listDataSet = bm6Var.c;
                bm6.a aVar3 = (bm6.a) obj;
                boolean z = aVar3.c;
                ArrayList<g6f0> arrayList = aVar3.a;
                if (z) {
                    listDataSet.setItems(arrayList);
                } else {
                    listDataSet.n0(arrayList);
                }
                int i6 = aVar3.b.i();
                boolean z2 = aVar3.d;
                String str = bm6Var.j;
                if (str != null && (h6f0Var = bm6Var.n) != null) {
                    h6f0Var.N4(i6, str, z2);
                }
                return s3q0.a;
            case 13:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj2;
                new ql7(bonusCatalogFragment.N, bonusCatalogFragment.O, true).a(bonusCatalogFragment.requireContext());
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new e4((ikv0) obj, i2));
                return s3q0.a;
            case 15:
                xg8 xg8Var = (xg8) obj2;
                zg8 zg8Var = (zg8) obj;
                if (!xg8Var.l) {
                    zmp0.a(xg8Var.a, new biq());
                }
                boolean z3 = zg8Var instanceof zg8.a;
                boolean z4 = zg8Var instanceof zg8.c;
                boolean z5 = zg8Var instanceof zg8.b;
                bwt0.p0(xg8Var.b, z3);
                bwt0.p0(xg8Var.c, z4);
                bwt0.p0(xg8Var.d, z3 || z4);
                bwt0.p0(xg8Var.e, z5);
                bwt0.p0(xg8Var.f, z5);
                bwt0.p0(xg8Var.g, z5);
                bwt0.p0(xg8Var.h, z5);
                return s3q0.a;
            case 16:
                Throwable th3 = (Throwable) obj;
                VkText vkText = ((lj8) obj2).g;
                Context context = e43.a;
                vkText.setText(j03.g(context != null ? context : null, th3, R.string.error));
                return s3q0.a;
            case 17:
                uuq uuqVar = (uuq) obj2;
                int i7 = uuq.a.$EnumSwitchMapping$0[((FeatureId) obj).ordinal()];
                if (i7 == 1) {
                    lcx0 lcx0Var = uuqVar.a;
                    lcx0Var.getClass();
                    com.vk.voip.ui.c.b.getClass();
                    int i8 = 27;
                    new io.reactivex.rxjava3.internal.operators.single.d0(new xbx0(com.vk.voip.ui.c.k0()).a().K(), new uga0(8), null).subscribe(new s440(new mmm0(lcx0Var, i8), i8));
                } else if (i7 == 2) {
                    uuqVar.b.getClass();
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.Y.h(!r1.e);
                } else if (i7 == 3) {
                    FragmentManager fragmentManager = uuqVar.c.c;
                    if (fragmentManager != null) {
                        com.vk.voip.ui.c.b.getClass();
                        va9.c(com.vk.voip.ui.c.i0(), fragmentManager);
                    }
                } else if (i7 == 4) {
                    uuqVar.d.getClass();
                } else {
                    if (i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uuqVar.e.getClass();
                }
                return s3q0.a;
            case 18:
                m99 m99Var = (m99) obj2;
                SessionRoomId sessionRoomId = (SessionRoomId) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, sessionRoomId, false, null, -1, 447), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 19:
                L.e("CallVmojiDelegate", "Ml model ready check signal consumed. Current thread is " + Thread.currentThread().getName());
                return Boolean.valueOf(((or2) ((va9) obj2).b.invoke()).c());
            case 20:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                float f5 = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null && presenter.U3() && (presenter2 = cameraUIView.getPresenter()) != null) {
                    presenter2.r4();
                }
                return s3q0.a;
            case 21:
                bp9 bp9Var = (bp9) obj2;
                MessagesContactDto messagesContactDto = (MessagesContactDto) obj;
                if (!epx.f(messagesContactDto.e(), Boolean.FALSE)) {
                    Contact.LastSeenStatus lastSeenStatus = m0c.a;
                    Contact.LastSeenStatus.a aVar4 = Contact.LastSeenStatus.Companion;
                    String f6 = messagesContactDto.f();
                    aVar4.getClass();
                    break;
                }
                r5 = true;
                Contact.LastSeenStatus.a aVar5 = Contact.LastSeenStatus.Companion;
                String f7 = messagesContactDto.f();
                aVar5.getClass();
                bp9Var.d.put(String.valueOf(messagesContactDto.getId()), new bp9.a(r5 ? UsersCanNotCallReasonDto.PRIVACY_SETTINGS : null, new oap.b(Contact.LastSeenStatus.a.a(f7))));
                return s3q0.a;
            case 22:
                ((k9k) obj2).a((Throwable) obj);
                return s3q0.a;
            case 23:
                return myc0.h(((dwj) obj).getScope(), null, null, new d4a((vcb0) obj2, null), 3);
            case 24:
                ((b2b) obj2).e.d(R.string.vkim_error_unknown);
                return s3q0.a;
            case 25:
                int i9 = iab.l1;
                ((iab) obj2).getFeature().C((hab) obj);
                return s3q0.a;
            case 26:
                ?? r1 = ((smb) obj2).c;
                if (r1 != 0) {
                    r1.c0();
                }
                return s3q0.a;
            case 27:
                com.vk.im.ui.components.chat_profile.a aVar6 = (com.vk.im.ui.components.chat_profile.a) obj2;
                int i10 = a.C1143a.$EnumSwitchMapping$4[((AccountAvatarAction) obj).ordinal()];
                if (i10 == 1) {
                    VkImAvatar vkImAvatar = aVar6.i;
                    aVar6.t(new zxd0.r(vkImAvatar != null ? vkImAvatar : null));
                } else if (i10 == 2) {
                    VkImAvatar vkImAvatar2 = aVar6.i;
                    aVar6.t(new zxd0.q(vkImAvatar2 != null ? vkImAvatar2 : null));
                }
                return s3q0.a;
            case 28:
                ((zx) obj2).invoke(new nbc((Throwable) obj, 7));
                return s3q0.a;
            default:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    String str2 = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
        }
    }
}
