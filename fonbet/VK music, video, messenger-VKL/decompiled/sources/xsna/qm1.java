package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.AuthStatSender;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.common.Image;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.h;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a;
import com.vk.photos.root.albums.presentation.c;
import com.vk.stories.analytics.StoryPublishEvent;
import java.util.ArrayList;
import xsna.aw6;
import xsna.d4e;
import xsna.is5;
import xsna.k36;
import xsna.mwa;
import xsna.t5e;
import xsna.uxd0;
import xsna.xse0;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qm1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qm1(h.c cVar, ChatClipsReplyFragment chatClipsReplyFragment) {
        this.b = 18;
        this.c = chatClipsReplyFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        pk30 pk30Var;
        switch (this.b) {
            case 0:
                ((com.vk.photos.root.albums.presentation.b) this.c).T(new c.g.C1496c((VKList) obj));
                break;
            case 1:
                tp2 tp2Var = (tp2) this.c;
                io.reactivex.rxjava3.disposables.c cVar = tp2Var.c;
                if (cVar != null) {
                    cVar.dispose();
                    tp2Var.c = null;
                    xse0.a aVar = tp2Var.d;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
                tp2Var.a.c0();
                break;
            case 2:
                is5 is5Var = (is5) this.c;
                ((zak0) is5Var.k).setValue((is5.b) is5Var.f.get((String) obj));
                break;
            case 3:
                ((d06) this.c).b.ko(((Boolean) obj).booleanValue());
                break;
            case 4:
                ((wh50) this.c).setValue((k36.e) obj);
                break;
            case 5:
                ((r46) this.c).k(uxd0.r0.a);
                break;
            case 6:
                ((gw6) this.c).a.onNext(aw6.c.a);
                break;
            case 7:
                break;
            case 8:
                ((izs) ((zak0) ((vo7) this.c).b).getValue()).invoke(new a.f.c((String) obj));
                break;
            case 9:
                ((Photo) this.c).b = (ArrayList) obj;
                break;
            case 10:
                gdj0 gdj0Var = (gdj0) this.c;
                tdu tduVar = (tdu) obj;
                float floatValue = ((vak0) gdj0Var.d.j).getFloatValue();
                float d = gdj0Var.d.e().d();
                float f = floatValue < d ? d - floatValue : 0.0f;
                tduVar.B(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 / ((Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (tduVar.d() & 4294967295L))) : 1.0f);
                tduVar.Y0(f370.i(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 11:
                com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) this.c;
                aVar2.h0((ClipsEditorInputData) obj);
                aVar2.h.c(StoryPublishEvent.ADD_FROM_GALLERY, null);
                break;
            case 12:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.b bVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.b) this.c;
                a.C1167a c1167a = bVar.w;
                String str = (c1167a != null ? c1167a : null).b.d;
                if (str != null && (pk30Var = bVar.l) != null) {
                    pk30Var.d(bVar.getAdapterPosition(), str);
                }
                break;
            case 13:
                ((izs) this.c).invoke(new yda.a((q1a) obj));
                break;
            case 14:
                aha ahaVar = (aha) this.c;
                cd80 cd80Var = (cd80) obj;
                if (!ahaVar.k) {
                    cd80Var.getClass();
                    break;
                } else {
                    i560 i560Var = ahaVar.d;
                    Context context = ahaVar.a;
                    boolean p = fxc0.B().s().p();
                    m1 m1Var = new m1(cd80Var, 12);
                    i560Var.getClass();
                    g560 g560Var = new g560(false, 0 == true ? 1 : 0);
                    ((com.vk.video.kidsprofile.restricteduseractions.a) i560Var.b.getValue()).getClass();
                    i0q0.j(new h560(i560Var, g560Var, context, p, m1Var));
                    break;
                }
            case 15:
                ((mwa) this.c).d = (mwa.a) obj;
                break;
            case 16:
                ((i9b) this.c).g();
                break;
            case 17:
                break;
            case 18:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = ChatClipsReplyFragment.T;
                if (!booleanValue) {
                    try {
                        chatClipsReplyFragment.tn();
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                }
                break;
            case 19:
                ((orb) this.c).a.d();
                break;
            case 20:
                ((cxb) this.c).k(new uxd0.p(new yc((io.reactivex.rxjava3.disposables.c) obj, 16)));
                break;
            case 21:
                ((r0c) this.c).e.a(AuthStatSender.Screen.PHONE_CODE);
                break;
            case 22:
                ((a8c) this.c).getClass();
                a8c.f((tr90) obj);
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                ClipVideoItem clipVideoItem = (ClipVideoItem) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(clipVideoItem.b, "file_uri");
                w9yVar.e(clipVideoItem.d, "file_uri_reversed");
                w9yVar.c(Integer.valueOf(clipVideoItem.c), "duration");
                w9yVar.g("music_info", clipVideoItem.e);
                w9yVar.g("mask", clipVideoItem.f);
                w9yVar.d(Long.valueOf(clipVideoItem.g), "audio_shift");
                w9yVar.e(Float.valueOf(clipVideoItem.h), "speed");
                w9yVar.c(Integer.valueOf(clipVideoItem.i), "start_ms");
                w9yVar.c(Integer.valueOf(clipVideoItem.j), "end_ms");
                w9yVar.g("filter_info", clipVideoItem.k);
                w9yVar.e(clipVideoItem.l.name(), "transcoding_state");
                w9yVar.b(Boolean.valueOf(clipVideoItem.m), "recorded_with_timer");
                w9yVar.g("transform", clipVideoItem.n);
                w9yVar.b(Boolean.valueOf(clipVideoItem.o), "from_photo");
                w9yVar.e(clipVideoItem.p.name(), "audio_effect");
                w9yVar.g("audio_config", clipVideoItem.q);
                w9yVar.g("location", clipVideoItem.r);
                w9yVar.e(Float.valueOf(clipVideoItem.s), "volume");
                break;
            case 26:
                ClipsDraftCommonData clipsDraftCommonData = (ClipsDraftCommonData) this.c;
                w9y w9yVar2 = (w9y) obj;
                w9yVar2.e(clipsDraftCommonData.b, "id");
                w9yVar2.c(Integer.valueOf(clipsDraftCommonData.c), "max_duration");
                w9yVar2.e(clipsDraftCommonData.d, "files");
                w9yVar2.e(clipsDraftCommonData.e, "description");
                w9yVar2.d(Long.valueOf(clipsDraftCommonData.f), "preview_timestamp");
                w9yVar2.b(Boolean.valueOf(clipsDraftCommonData.g), "autosaved");
                w9yVar2.c(Integer.valueOf(clipsDraftCommonData.h), "date");
                w9yVar2.b(Boolean.valueOf(clipsDraftCommonData.i), "is_preview_from_gallery");
                w9yVar2.e(clipsDraftCommonData.j, "preview_uri");
                w9yVar2.e(clipsDraftCommonData.l, "audios");
                w9yVar2.e(clipsDraftCommonData.k, "entry_point");
                w9yVar2.f("aspect_ratio", Double.valueOf(clipsDraftCommonData.m));
                w9yVar2.g("ord_info", clipsDraftCommonData.n);
                w9yVar2.d(clipsDraftCommonData.o, "delayed_publication_date");
                break;
            case 27:
                h5e h5eVar = (h5e) this.c;
                h5eVar.c.g(new d4e.a.f((u2e) obj));
                h5eVar.b.d(t5e.p.a, null);
                break;
            case 28:
                ((com.vk.clips.interests.impl.feature.a) this.c).T(new jhe((Image) obj));
                break;
            default:
                ((zg) this.c).invoke();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qm1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
