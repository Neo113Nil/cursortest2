package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.libvideo.ad.MyTargetAdLoadingState;
import com.vk.log.L;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aop0;
import xsna.ded;
import xsna.f5h0;
import xsna.it80;
import xsna.nmp;
import xsna.onp0;
import xsna.q8z;
import xsna.ria0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u620 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ u620() {
        this.b = 21;
        TimeUnit timeUnit = TimeUnit.SECONDS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.drawable.Drawable] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        onp0 onp0Var;
        int i;
        int i2 = 6;
        boolean z = false;
        r3 = false;
        boolean z2 = false;
        z = false;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                k720 k720Var = k720.a;
                k720.Y(th);
                k720.A = null;
                io.reactivex.rxjava3.subjects.h hVar = k720.E;
                it80.a aVar = it80.b;
                n9n0 n9n0Var = k720.R;
                aVar.getClass();
                hVar.onNext(new it80(n9n0Var));
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                nmp nmpVar = (nmp) obj;
                if (nmpVar instanceof nmp.b) {
                    return io.reactivex.rxjava3.internal.operators.single.a0.b;
                }
                if (!(nmpVar instanceof nmp.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nmp.a aVar2 = (nmp.a) nmpVar;
                if (aVar2 instanceof nmp.a.b) {
                    onp0Var = onp0.c.a;
                } else if (aVar2 instanceof nmp.a.C3404a) {
                    onp0Var = onp0.b.a;
                } else {
                    if (!(aVar2 instanceof nmp.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onp0Var = onp0.d.a;
                }
                return io.reactivex.rxjava3.core.x.k(new aop0.b(onp0Var));
            case 2:
                EcosystemSendOtpResponseDto ecosystemSendOtpResponseDto = (EcosystemSendOtpResponseDto) obj;
                return new uhi0(ecosystemSendOtpResponseDto.d(), ecosystemSendOtpResponseDto.e(), ecosystemSendOtpResponseDto.g());
            case 3:
                return new VkTopBar((Context) obj, r4, i2, z ? 1 : 0);
            case 4:
                return Boolean.valueOf(((Attach) obj) instanceof AttachWidget);
            case 5:
                return xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.m(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), null, 2)), anp.f(jq2.d(90, 0, null, 6), 2));
            case 6:
                qgi0.r((tgi0) obj, "downloads_settings_remove_all_btn");
                return s3q0.a;
            case 7:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM playlists_to_tracks");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                }
            case 8:
                return Boolean.valueOf(wk70.j((com.vk.im.engine.models.messages.a) obj));
            case 9:
                return com.vk.music.playlist.display.audiobook.offline.presentation.feature.a.a((OfflineAudioBookChaptersMviState) obj);
            case 10:
                return new ria0.a(((tj50.a) obj).a(mia0.b, ao8.d));
            case 11:
                return v11.b(1, (Integer) obj);
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    i = R.string.music_talkback_player_pause;
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_player_podcast_play;
                }
                return Integer.valueOf(i);
            case 13:
                return Boolean.valueOf(((v9c0) obj).f);
            case 14:
                View view = (View) obj;
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                return Boolean.valueOf((imageView != null ? imageView.getDrawable() : 0) instanceof RLottieDrawable);
            case 15:
                return new AudioAttachment((MusicTrack) obj);
            case 16:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Can not load last posting draft id", (Throwable) obj));
                return s3q0.a;
            case 17:
                return new ArrayList();
            case 18:
                return ((PostingState.Editing) obj).o.c;
            case 19:
                qgi0.r((tgi0) obj, "PublicationDateDialogTags.DATE_TIME_INPUT");
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                return Long.valueOf((long) Math.rint(((float) Math.pow(2.0f, ((Integer) obj).intValue() - 1)) * TimeUnit.SECONDS.toMillis(2L)));
            case 22:
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                Object obj3 = list.get(1);
                return new q8z.a(str, (epx.f(obj3, Boolean.FALSE) || obj3 == null) ? null : (tjo0) ((izs) i2h0.j.c).invoke(obj3), null);
            case 23:
                com.vk.im.engine.reporters.syncstate.e eVar = (com.vk.im.engine.reporters.syncstate.e) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(eVar.a);
                sb.append(':');
                sb.append(eVar.b);
                return sb.toString();
            case 24:
                qyg0 V02 = ((hyg0) obj).V0("SELECT `stickers_recommendations`.`id` AS `id`, `stickers_recommendations`.`packIdsInKeyboard` AS `packIdsInKeyboard`, `stickers_recommendations`.`packs` AS `packs` FROM stickers_recommendations");
                try {
                    return V02.step() ? new acl0((int) V02.getLong(0), psj.b(V02.l2(1)), psj.f(V02.l2(2))) : null;
                } finally {
                }
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                Pair pair = (Pair) obj;
                if (pair.j() instanceof ded.h) {
                    ClipUploaderData.Author author = ((ClipUploadJob) pair.i()).c;
                    if ((author != null ? author.e() : null) != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                ((ojt) obj).l = f5h0.f.a;
                return s3q0.a;
            case 28:
                return new SimpleAttachListItem((HistoryAttach) obj);
            default:
                MyTargetAdLoadingState myTargetAdLoadingState = (MyTargetAdLoadingState) obj;
                if (myTargetAdLoadingState != MyTargetAdLoadingState.NOT_INITIALIZED && myTargetAdLoadingState != MyTargetAdLoadingState.INITIALIZING) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ u620(int i) {
        this.b = i;
    }

    public /* synthetic */ u620(Object obj, int i) {
        this.b = i;
    }
}
