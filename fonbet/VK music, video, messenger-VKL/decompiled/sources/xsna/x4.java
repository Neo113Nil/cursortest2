package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireDto;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.gte;
import xsna.rew0;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x4 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ x4(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.vk.clips.sdk.shared.paging.PaginationKey$Next] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        AudioPhotoDto f;
        ApiSessionStore lambda$joinByLinkInternal$6;
        String str = null;
        str = null;
        switch (this.b) {
            case 0:
                return Float.valueOf(((aar0) obj).b / 5.0f);
            case 1:
                xgx0 xgx0Var = xgx0.a;
                String th = ((Throwable) obj).toString();
                xgx0Var.getClass();
                xgx0.a(th);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, null, 1007);
            case 4:
                return ((ku4) obj).c;
            case 5:
                qgi0.u((tgi0) obj);
                return s3q0.a;
            case 6:
                return (com.vk.ecomm.onlinebooking.impl.services.presentation.c) obj;
            case 7:
                rew0.a aVar = (rew0.a) obj;
                return new od9(aVar.a, aVar.b, aVar.c);
            case 8:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, false, 7);
            case 9:
                return String.valueOf(((MsgSyncState) obj).j());
            case 10:
                return Long.valueOf(((Peer) obj).b);
            case 11:
                ((io.reactivex.rxjava3.functions.a) obj).run();
                return s3q0.a;
            case 12:
                pqc.e.compareAndSet(true, false);
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr = ClipVideoFileAdapter.B;
                int i = bz80.$EnumSwitchMapping$0[((OriginalSoundStatus) obj).ordinal()];
                if (i == 1) {
                    return SdkOriginalSoundStatus.NONE;
                }
                if (i == 2) {
                    return SdkOriginalSoundStatus.MODERATING;
                }
                if (i == 3) {
                    return SdkOriginalSoundStatus.APPROVED;
                }
                if (i == 4) {
                    return SdkOriginalSoundStatus.DENIED;
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                i0q0.f(new nd1(5));
                return s3q0.a;
            case 16:
                return fnd.b((ClipsCoauthorsSelectorMviState.c) obj);
            case 17:
                xtw xtwVar = (xtw) obj;
                int i2 = xtwVar.a;
                AudioAudioDto audioAudioDto = (AudioAudioDto) xtwVar.b;
                AudioAudioAlbumDto f2 = audioAudioDto.f();
                if (f2 != null && (f = f2.f()) != null) {
                    str = f.g();
                }
                Regex regex = com.vk.core.files.a.a;
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.RANDOM_MUSIC_COVERS;
                privateFiles.getClass();
                b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                File file = new File(b.a, String.valueOf(i2) + ".png");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return new io.reactivex.rxjava3.internal.operators.observable.i0(dug0.a(file, str), new ca6(new db(19), 6)).U(new z7(new fb(audioAudioDto, 26), 13));
            case 18:
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new hae((List) obj, 0));
            case 19:
                return Boolean.valueOf(!(((gte.a) obj).d instanceof gte.a.InterfaceC2955a.C2956a));
            case 20:
                ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
                List e = ums0.e(ums0.a, shortVideoFeedClipsBlockItemsGroupsFullResultDto.f(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.i(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.e(), false, 52);
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(new wih0.a(k15.B((VideoFile) it.next()), null));
                }
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                String g = shortVideoFeedClipsBlockItemsGroupsFullResultDto.g();
                PaginationKey.LoadedFull next = (g == null || g.length() == 0 || g.equals("null")) ? loadedFull : new PaginationKey.Next(g);
                List<ShortVideoQuestionnaireDto> j = shortVideoFeedClipsBlockItemsGroupsFullResultDto.j();
                return new qih0(arrayList, loadedFull, next, null, j != null ? egj0.a(j) : null);
            case 21:
                Throwable th2 = (Throwable) obj;
                int i3 = CommunitiesManageNotificationsFragment.Z;
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th2, R.string.error), false);
                return s3q0.a;
            case 22:
                return ((wah) obj).f;
            case 23:
                lambda$joinByLinkInternal$6 = ConversationFactory.lambda$joinByLinkInternal$6((ApiSessionStore) obj);
                return lambda$joinByLinkInternal$6;
            case 24:
                return s3q0.a;
            case 25:
                return Integer.valueOf(((c9k) obj).x.size());
            case 26:
                int i4 = com.vk.profile.questions.impl.b.q1;
                qgi0.r((tgi0) obj, "close_question_button");
                return s3q0.a;
            case 27:
                Bitmap bitmap = (Bitmap) obj;
                return fkw.c(bitmap.getWidth() / 2, bitmap);
            case 28:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_leave_dialog, (Context) obj);
            default:
                qcy<Object>[] qcyVarArr2 = DiscoverSimilarFeedFragment.s0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
        }
    }

    public /* synthetic */ x4(Object obj, int i) {
        this.b = i;
    }
}
