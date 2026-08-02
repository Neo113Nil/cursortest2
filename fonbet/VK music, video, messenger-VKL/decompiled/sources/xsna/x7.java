package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import com.vk.api.generated.market.dto.MarketGetItemsByVideoResponseDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.components.chat_profile.ChatProfileBottomSheetBuilder;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.voip.ui.assessment.BadAssessmentReason;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.ap9;
import xsna.fu4;
import xsna.gm50;
import xsna.io8;
import xsna.iqb;
import xsna.my;
import xsna.oj8;
import xsna.px9;
import xsna.usc;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d5  */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44, types: [xsna.j8i, xsna.smb$a] */
    /* JADX WARN: Type inference failed for: r2v45, types: [xsna.spb$a] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        Iterator it;
        int i2;
        Iterator it2;
        int i3;
        bg8 presenter;
        int i4 = this.b;
        int i5 = 2;
        ?? r4 = 1;
        ?? r42 = 1;
        int i6 = 0;
        Object obj2 = this.c;
        switch (i4) {
            case 0:
                AboutVideoItem.h hVar = (AboutVideoItem.h) obj2;
                return new AboutVideoItem.h(hVar.b, hVar.c, hVar.d, hVar.e, hVar.f, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k, hVar.l, b210.e(((MarketGetItemsByVideoResponseDto) obj).d()), hVar.n);
            case 1:
                my.a aVar = (my.a) obj;
                ((ky) obj2).d.getClass();
                List<ActionButton> list = aVar.b;
                hy hyVar = aVar.d;
                List<ActionButton> list2 = list;
                boolean z = list2 instanceof Collection;
                if (!z || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((ActionButton) it3.next()).f == ActionButton.Type.Action) {
                            i = 1;
                            if (z || !list2.isEmpty()) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((ActionButton) it.next()).f == ActionButton.Type.DonutLevel) {
                                        i2 = 1;
                                        if (z || !list2.isEmpty()) {
                                            it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                if (((ActionButton) it2.next()).f == ActionButton.Type.DonutGoal) {
                                                    i3 = 1;
                                                    ?? r7 = (i + i2) + i3 <= 1;
                                                    ListBuilder e = e43.e();
                                                    if (i != 0) {
                                                        qy.a(aVar, e, hyVar, r7 != false ? Integer.valueOf(R.string.action_button_section_actions) : null, new qt(r42 == true ? 1 : 0));
                                                    }
                                                    if (i2 != 0) {
                                                        qy.a(aVar, e, hyVar, r7 != false ? Integer.valueOf(R.string.action_button_title_donut_level) : null, new py(i6));
                                                    }
                                                    if (i3 != 0) {
                                                        qy.a(aVar, e, hyVar, r7 == true ? Integer.valueOf(R.string.action_button_title_donut_goal) : null, new ol(r4 == true ? 1 : 0));
                                                    }
                                                    return e.g();
                                                }
                                            }
                                        }
                                        i3 = 0;
                                        if ((i + i2) + i3 <= 1) {
                                        }
                                        ListBuilder e2 = e43.e();
                                        if (i != 0) {
                                        }
                                        if (i2 != 0) {
                                        }
                                        if (i3 != 0) {
                                        }
                                        return e2.g();
                                    }
                                }
                            }
                            i2 = 0;
                            if (z) {
                            }
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                            }
                            i3 = 0;
                            if ((i + i2) + i3 <= 1) {
                            }
                            ListBuilder e22 = e43.e();
                            if (i != 0) {
                            }
                            if (i2 != 0) {
                            }
                            if (i3 != 0) {
                            }
                            return e22.g();
                        }
                    }
                }
                i = 0;
                if (z) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                i2 = 0;
                if (z) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                i3 = 0;
                if ((i + i2) + i3 <= 1) {
                }
                ListBuilder e222 = e43.e();
                if (i != 0) {
                }
                if (i2 != 0) {
                }
                if (i3 != 0) {
                }
                return e222.g();
            case 2:
                ((gq1) obj2).e.invoke(Boolean.FALSE);
                return s3q0.a;
            case 3:
                ((tgi0) obj).a(kdi0.c, new jdi0(Handle.Cursor, ((wv70) obj2).a(), SelectionHandleAnchor.Middle, true));
                return s3q0.a;
            case 4:
                ((ov3) obj2).a(new uv3((Throwable) obj));
                return s3q0.a;
            case 5:
                Pair pair = (Pair) obj;
                ((qy3) obj2).a.A1(((Number) pair.d()).floatValue(), ((Number) pair.g()).floatValue());
                return s3q0.a;
            case 6:
                ((au4) obj2).T(fu4.c.b);
                return s3q0.a;
            case 7:
                hy5 hy5Var = (hy5) obj2;
                BadAssessmentReason badAssessmentReason = hy5Var.k;
                if (badAssessmentReason == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((v080) hy5Var.getActivity()).S0(badAssessmentReason);
                return s3q0.a;
            case 8:
                p66 p66Var = (p66) obj2;
                p66Var.s0(p66Var.u - 1);
                p66Var.t0(p66Var.v - 1);
                return s3q0.a;
            case 9:
                wj6 wj6Var = (wj6) obj2;
                Photo photo = (Photo) obj;
                return wj6Var.d.d(wj6Var.h, photo, wj6Var.i.contains(photo));
            case 10:
                return new ju6((h6p0) obj2);
            case 11:
                c37 c37Var = (c37) obj2;
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    y27 y27Var = (y27) c37Var.a;
                    if (y27Var != null) {
                        y27Var.F6(null);
                    }
                    y27 y27Var2 = (y27) c37Var.a;
                    if (y27Var2 != null) {
                        y27Var2.qf(true);
                    }
                } else {
                    y27 y27Var3 = (y27) c37Var.a;
                    if (y27Var3 != null) {
                        long longValue = l.longValue();
                        long j = 60;
                        y27Var3.F6(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((longValue % 3600) / j), Long.valueOf(longValue % j)}, 2)));
                    }
                    y27 y27Var4 = (y27) c37Var.a;
                    if (y27Var4 != null) {
                        y27Var4.qf(false);
                    }
                }
                return s3q0.a;
            case 12:
                xb7 xb7Var = (xb7) obj2;
                Canvas canvas = (Canvas) obj;
                Matrix matrix = xb7Var.e;
                Matrix matrix2 = xb7Var.f;
                int save = canvas.save();
                canvas.concat(matrix);
                try {
                    int save2 = canvas.save();
                    canvas.concat(matrix2);
                    canvas.restoreToCount(save2);
                    canvas.drawBitmap(xb7Var.b, matrix2, xb7Var.d);
                    canvas.restoreToCount(save);
                    return s3q0.a;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            case 13:
                lj8 lj8Var = (lj8) obj2;
                lj8Var.j.setItems(EmptyList.b);
                lj8Var.d.setRefreshing(false);
                lj8Var.a((p5h0) lj8Var.n.getValue());
                gm50.a.a(lj8Var, ((oj8.b) obj).a, new jy(lj8Var, 16));
                return s3q0.a;
            case 14:
                lo8 lo8Var = (lo8) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.core.q.T(io8.a.a);
                }
                io.reactivex.rxjava3.internal.operators.observable.m1 a = lo8Var.a.l.a();
                io.reactivex.rxjava3.core.w wVar = lo8Var.c;
                return new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(a.a0(wVar).r0(wVar), new v20(new qt(10), 6)), new yi2(new zt4(lo8Var, i5), 4)).o0(lo8Var.b());
            case 15:
                rfd0 rfd0Var = (rfd0) obj;
                cg8 broadcastFriends = ((com.vk.cameraui.impl.a) obj2).b.getBroadcastFriends();
                if (broadcastFriends != null && (presenter = broadcastFriends.getPresenter()) != null) {
                    presenter.j(rfd0Var);
                }
                return s3q0.a;
            case 16:
                MessagesContactDto messagesContactDto = (MessagesContactDto) obj;
                fow0 fow0Var = ((bp9) obj2).c;
                Contact.LastSeenStatus lastSeenStatus = m0c.a;
                Contact.LastSeenStatus.a aVar2 = Contact.LastSeenStatus.Companion;
                String f = messagesContactDto.f();
                aVar2.getClass();
                boolean a2 = m0c.a(Contact.LastSeenStatus.a.a(f));
                Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                String d = messagesContactDto.d();
                if (d == null) {
                    d = "";
                }
                Long n = arm0.n(d);
                CallsUserId contactId = n == null ? new CallsUserId.ContactId(d) : new CallsUserId.VkUserId(new UserId(n.longValue()));
                boolean b = fow0Var.b(contactId);
                if (epx.f(messagesContactDto.e(), Boolean.FALSE) || (a2 && b)) {
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    return new ap9.b(new gp9(new Peer.Contact(messagesContactDto.getId() + 1900000000), messagesContactDto.g(), messagesContactDto.g(), false, UsersCanNotCallReasonDto.PRIVACY_SETTINGS));
                }
                fow0Var.a(contactId, true);
                return ap9.a.a;
            case 17:
                L.i((Throwable) obj);
                ((vw9) obj2).T(new px9.f.b());
                return s3q0.a;
            case 18:
                return PlaylistScreenState.a((PlaylistScreenState) obj, (PlaylistScreenInfoDataState.Loaded) obj2, null, false, false, null, null, null, 2043);
            case 19:
                int i7 = ChannelDonutSupportFragment.V;
                ((ChannelDonutSupportFragment) obj2).getFeature().C((com.vk.channels.impl.donut.a) obj);
                return s3q0.a;
            case 20:
                ((b2b) obj2).e.d(R.string.vkim_error_unknown);
                return s3q0.a;
            case 21:
                Throwable th2 = (Throwable) obj;
                ?? r2 = ((smb) obj2).c;
                if (r2 != 0) {
                    r2.L(th2);
                }
                return s3q0.a;
            case 22:
                bqb bqbVar = (bqb) obj2;
                iqb.a aVar3 = bqbVar.m;
                ?? r22 = bqbVar.q;
                aVar3.invoke(r22 != 0 ? r22 : null);
                return s3q0.a;
            case 23:
                ((ktb) obj2).i.jd(new bb((io.reactivex.rxjava3.disposables.c) obj, 15));
                return s3q0.a;
            case 24:
                ((com.vk.im.ui.components.chat_profile.a) obj2).t(new zxd0.c(((ChatProfileBottomSheetBuilder.CallOption) obj) == ChatProfileBottomSheetBuilder.CallOption.VIDEO));
                return s3q0.a;
            case 25:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qcy<Object>[] qcyVarArr = isc.t1;
                ((btc) obj2).b(new usc.a.C3818a(booleanValue));
                return s3q0.a;
            case 26:
                Throwable th3 = (Throwable) obj;
                L.g("ClipsAuthorsSelectorPresenter", th3);
                h03.b(th3);
                rhh0 rhh0Var = ((mid) obj2).d;
                if (rhh0Var != null) {
                    rhh0Var.k();
                }
                return s3q0.a;
            case 27:
                zld zldVar = (zld) obj2;
                Pair pair2 = (Pair) obj;
                return new ClipsChoosePreviewResult(zldVar.f.a().b().b((Bitmap) pair2.d()), false, ((Number) pair2.g()).longValue(), zldVar.k);
            default:
                ((com.vk.clips.entrypoints.ui.d) obj2).b.invoke(a.g.b);
                ((etv0) obj).b(false);
                return s3q0.a;
        }
    }
}
