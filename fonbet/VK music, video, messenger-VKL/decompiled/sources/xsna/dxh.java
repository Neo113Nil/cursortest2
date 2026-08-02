package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.vk.api.generated.auth.dto.AuthValidateEmailResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.editor.filters.correction.entity.CorrectionType;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.media.player.pool.OneVideoPlayerConfigInitializer;
import com.vk.photos.ui.editalbum.presentation.EditAlbumPrivacyFragment;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.c2r;
import xsna.eeu0;
import xsna.exh;
import xsna.h6p;
import xsna.h7u0;
import xsna.ikv0;
import xsna.l2f;
import xsna.ro20;
import xsna.tj50;
import xsna.tlo0;
import xsna.v1j;
import xsna.wk50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dxh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dxh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v91, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.Size, xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        ImageSize Cb;
        int i = this.b;
        Mask mask = null;
        r2 = null;
        String str = null;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((exh) ((exh.a) obj2).m).h.invoke((View) obj, CommunityActionTags.MESSAGE);
                return s3q0.a;
            case 1:
                l2f.a aVar = (l2f.a) obj2;
                aVar.b((io.reactivex.rxjava3.disposables.c) obj);
                l2f.a.c(aVar);
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj2;
                Throwable th = (Throwable) obj;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                int i3 = kwg0.a;
                b25 b25Var = cVar.k;
                Context context = cVar.l;
                if (o25.b(b25Var)) {
                    int i4 = 6;
                    if ((th instanceof NoNetworkConnectionException) || h03.a(th)) {
                        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_error_no_network);
                        ikv0.a aVar2 = new ikv0.a(context);
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_20, valueOf, (Size) r2, 12);
                        CharSequence a = tlo0.b.a(h, context);
                        aVar2.u = new ikv0.d(new ikv0.d.c(a != null ? a.toString() : null), (ikv0.d.b) r2, (ikv0.d.a) r2, i4);
                        aVar2.n();
                    } else {
                        tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_error_internal);
                        ikv0.a aVar3 = new ikv0.a(context);
                        float f = 28;
                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, valueOf, new Size(iah0.a(f), iah0.a(f)), 8);
                        aVar3.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context).toString()), (ikv0.d.b) r2, (ikv0.d.a) r2, i4);
                        aVar3.n();
                    }
                }
                return s3q0.a;
            case 3:
                CorrectionType correctionType = (CorrectionType) obj2;
                int i5 = CorrectionsRecyclerView.i;
                return Boolean.valueOf(((lwj) obj).a == correctionType);
            case 4:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                rdi.s(sQLiteDatabase, new ekh(sQLiteDatabase, i2));
                return s3q0.a;
            case 5:
                OneVideoPlayerConfigInitializer.a();
                i0q0.j(new ux3((qkl) obj2, 3));
                return s3q0.a;
            case 6:
                psm psmVar = (psm) obj2;
                oum oumVar = (oum) obj;
                List<pgm> list = oumVar.a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return oumVar;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((pgm) it.next()) instanceof em20) {
                        return psmVar.w(oumVar, EmptySet.b);
                    }
                }
                return oumVar;
            case 7:
                return pwm.a((pwm) obj, false, 0, false, null, false, 0, null, ((ob80) ((a1s) obj2)).b, false, 24575);
            case 8:
                int i6 = EditAlbumPrivacyFragment.X0;
                ((EditAlbumPrivacyFragment) obj2).Qo();
                return s3q0.a;
            case 9:
                final g1p g1pVar = (g1p) obj2;
                final SessionRoomId.Room room = g1pVar.g1;
                if (room != null) {
                    int i7 = h7u0.p;
                    h7u0.a c = h7u0.b.c(g1pVar.requireContext());
                    c.g0(R.string.voip_session_room_admin_room_remove_dialog_title);
                    c.U(R.string.voip_session_room_admin_room_remove_dialog_description);
                    c.c0(R.string.voip_session_room_admin_room_remove_dialog_confirm, new DialogInterface.OnClickListener() { // from class: xsna.e1p
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            g1p g1pVar2 = g1p.this;
                            a2j a2jVar = g1pVar2.f1;
                            if (a2jVar != null) {
                                a2jVar.C(new v1j.m(room, g1pVar2.h1));
                            }
                        }
                    });
                    c.W(R.string.voip_session_room_admin_room_remove_confirm_cancel, null);
                    c.m();
                    g1pVar.tn();
                }
                return s3q0.a;
            case 10:
                i6p i6pVar = (i6p) obj2;
                h6p h6pVar = (h6p) obj;
                if (!(h6pVar instanceof h6p.b)) {
                    i6pVar.getClass();
                    return s3q0.a;
                }
                l6p l6pVar = i6pVar.b;
                ((h6p.b) h6pVar).getClass();
                l6pVar.getClass();
                throw null;
            case 11:
                ((fcp) obj2).H = ((AuthValidateEmailResponseDto) obj).e();
                return s3q0.a;
            case 12:
                return Boolean.valueOf(epx.f(((de6) obj).d, (Attachment) obj2));
            case 13:
                ((bq60) obj2).a(new yo60.e.f((io.reactivex.rxjava3.disposables.c) obj));
                return s3q0.a;
            case 14:
                ((jnq) obj2).f();
                return s3q0.a;
            case 15:
                ((wk50.a) obj2).b(new c2r.h.a((Throwable) obj));
                return s3q0.a;
            case 16:
                ((p1r) obj2).d0.so(false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                return zjt.V((zjt) obj2, (Canvas) obj);
            case 18:
                c0v0 c0v0Var = ((gvv) obj2).e;
                Fragment fragment = c0v0Var.b;
                if (c0v0Var.t != 0) {
                    eeu0.a aVar4 = new eeu0.a(fragment.kn());
                    aVar4.B(R.string.vk_confirm);
                    Context requireContext = fragment.requireContext();
                    Context requireContext2 = fragment.requireContext();
                    String str2 = c0v0Var.w;
                    r2 = str2 != null ? str2 : 0;
                    int hashCode = r2.hashCode();
                    if (hashCode == -1147692044) {
                        if (r2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                            string = requireContext2.getString(R.string.vk_identity_address_dat);
                            aVar4.a.f = requireContext.getString(R.string.vk_delete_msgs_confirm, string);
                            aVar4.setPositiveButton(R.string.vk_yes, new rm1(c0v0Var, 4));
                            aVar4.setNegativeButton(R.string.cancel, new o1c());
                            aVar4.m();
                        }
                        throw new IllegalStateException(r2.concat(" not supported"));
                    }
                    if (hashCode == 96619420) {
                        if (r2.equals("email")) {
                            string = requireContext2.getString(R.string.vk_identity_email_dat);
                            aVar4.a.f = requireContext.getString(R.string.vk_delete_msgs_confirm, string);
                            aVar4.setPositiveButton(R.string.vk_yes, new rm1(c0v0Var, 4));
                            aVar4.setNegativeButton(R.string.cancel, new o1c());
                            aVar4.m();
                        }
                        throw new IllegalStateException(r2.concat(" not supported"));
                    }
                    if (hashCode == 106642798 && r2.equals("phone")) {
                        string = requireContext2.getString(R.string.vk_identity_phone_dat);
                        aVar4.a.f = requireContext.getString(R.string.vk_delete_msgs_confirm, string);
                        aVar4.setPositiveButton(R.string.vk_yes, new rm1(c0v0Var, 4));
                        aVar4.setNegativeButton(R.string.cancel, new o1c());
                        aVar4.m();
                    }
                    throw new IllegalStateException(r2.concat(" not supported"));
                }
                return s3q0.a;
            case 19:
                int i8 = ImSelectContactsFragment.v0;
                ((ImSelectContactsFragment) obj2).eo();
                return s3q0.a;
            case 20:
                String str3 = (String) obj;
                yks0 yks0Var = ((i8z) obj2).k;
                if (yks0Var != null) {
                    yks0Var.b = str3;
                }
                return s3q0.a;
            case 21:
                ((cdz) obj2).a.invoke();
                return s3q0.a;
            case 22:
                return new e.b(((tj50.a) obj).a(new ekh((com.vk.ecomm.reviews.impl.allreviews.presentation.d) obj2, 14), ao8.d));
            case 23:
                r110 r110Var = (r110) obj2;
                VKImageView vKImageView = (VKImageView) obj;
                Good good = r110Var.F;
                if (good == null) {
                    good = null;
                }
                Image image = good.n;
                if (image != null && (Cb = image.Cb(vKImageView.getWidth(), true, false)) != null) {
                    str = Cb.d.d;
                }
                r110Var.G.load(str);
                return s3q0.a;
            case 24:
                return new Pair((Photo) obj2, (List) obj);
            case 25:
                MasksWrap masksWrap = (MasksWrap) obj2;
                int i9 = MasksWrap.e0;
                com.vk.content.design.view.camera.a.o(masksWrap);
                Mask selectedMask = masksWrap.getSelectedMask();
                if (selectedMask != null) {
                    mask = selectedMask.zb();
                    mask.w = true;
                }
                masksWrap.setSelectedMask(mask);
                return s3q0.a;
            case 26:
                vo20 vo20Var = (vo20) obj2;
                View view = vo20Var.g;
                TextView textView = vo20Var.i;
                View view2 = vo20Var.h;
                ImageView imageView = vo20Var.f;
                if (epx.f((ro20) obj, ro20.b.a)) {
                    bwt0.p0(imageView, true);
                    bwt0.p0(view2, false);
                    bwt0.p0(textView, false);
                    bwt0.p0(view, true);
                } else {
                    bwt0.p0(imageView, true);
                    bwt0.p0(view, true);
                    bwt0.p0(view2, true);
                    bwt0.p0(textView, true);
                }
                return s3q0.a;
            case 27:
                ((vi40) obj2).e.onNext((List) obj);
                return s3q0.a;
            case 28:
                UserId userId = (UserId) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if ((uIBlock instanceof UIBlockAudioContentCard.PodcastCard) && epx.f(((UIBlockAudioContentCard.PodcastCard) uIBlock).A.c, userId)) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            default:
                ((qs40) obj2).C(bs40.b);
                return s3q0.a;
        }
    }
}
