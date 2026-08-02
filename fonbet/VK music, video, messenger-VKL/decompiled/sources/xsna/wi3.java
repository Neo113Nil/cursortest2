package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.im.MsgType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.reactions.Reaction;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.log.L;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.e3m;
import xsna.xn50;

/* compiled from: ArchiveRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class wi3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 5;
        switch (this.b) {
            case 0:
                ((ufa0) this.receiver).getClass();
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ke8 ke8Var = (ke8) this.receiver;
                bwt0.p0(ke8Var.s, booleanValue && ke8Var.d.a());
                break;
            case 2:
                com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.receiver;
                aVar.getClass();
                if (epx.f((MsgType) obj, MsgType.Delayed.b)) {
                    aVar.J(aVar.p.l() != null ? aVar.p : ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 32511));
                }
                break;
            case 3:
                jdo jdoVar = (jdo) obj;
                atd atdVar = (atd) this.receiver;
                atdVar.getClass();
                ClipAudioTemplate clipAudioTemplate = jdoVar.e;
                if (clipAudioTemplate != null) {
                    atdVar.d.a(((v8f) atdVar.h.getValue()).a(atdVar.b.getContext(), clipAudioTemplate.b).m(asu0.a.d()).subscribe(new st0(new com.vk.im.engine.commands.messages.a(12, atdVar, jdoVar), 6), new zl0(new aq1(i, atdVar, jdoVar), 9)));
                } else {
                    atdVar.b(jdoVar, null);
                }
                break;
            case 4:
                ((iqf) this.receiver).T((ttf) obj);
                break;
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i2 = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.getClass();
                clipsWrapperFragment.go(new he3(13, (huf) obj, clipsWrapperFragment));
                break;
            case 6:
                qyg qygVar = (qyg) this.receiver;
                qygVar.getClass();
                xn50.a.c(qygVar, (kyg) obj);
                break;
            case 7:
                ((cfm) this.receiver).B((u8m) obj);
                break;
            case 8:
                ((bn50) this.receiver).b((cro) obj);
                break;
            case 9:
                ((com.vk.auth.enterphone.a) this.receiver).A0((String) obj);
                break;
            case 10:
                rw30 rw30Var = (rw30) this.receiver;
                qcy<Object>[] qcyVarArr = rw30.D;
                rw30Var.getClass();
                rw30Var.Q((q2a0) obj, null);
                break;
            case 11:
                MusicTrack musicTrack = (MusicTrack) obj;
                hd50 hd50Var = (hd50) this.receiver;
                ThumbsImageView thumbsImageView = hd50Var.h;
                TextView textView = hd50Var.i;
                Context context = textView.getContext();
                String str = musicTrack.d;
                String str2 = musicTrack.e;
                Float valueOf = Float.valueOf(textView.getTextSize());
                ucp ucpVar = ucp.a;
                textView.setText(ucp.j(s490.d(context, str, str2, R.attr.vk_ui_text_secondary), valueOf));
                Context context2 = textView.getContext();
                e3m.a aVar2 = e3m.a;
                Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2);
                if (musicTrack.Lb()) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setCompoundDrawablePadding(cn70.b(5));
                hd50Var.k.setVisibility(musicTrack.Lb() ? 0 : 8);
                hd50Var.l.setVisibility((musicTrack.Q & 4) == 0 ? 8 : 0);
                thumbsImageView.setThumb(musicTrack.Jb());
                thumbsImageView.setContentDescription(hd50Var.e.getContext().getString(musicTrack.Bb() == 1 ? R.string.music_talkback_track_cover_one_author : R.string.music_talkback_track_cover_many_authors, musicTrack.d, musicTrack.h));
                TextView textView2 = hd50Var.j;
                textView2.setText(ucp.j(fai.k(musicTrack), Float.valueOf(textView2.getTextSize())));
                break;
            case 12:
                int intValue = ((Number) obj).intValue();
                s2f0 s2f0Var = (s2f0) this.receiver;
                Reaction reaction = s2f0Var.c.get(intValue);
                s2f0Var.e.invoke(reaction, Boolean.valueOf(epx.f(s2f0Var.d, reaction.b)));
                break;
            case 13:
                ((bnu0) this.receiver).a((String) obj);
                break;
            case 14:
                L.i((Throwable) obj);
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi3(Object obj, int i) {
        super(1, obj, ufa0.class, "map", "map(Lcom/vk/api/generated/photos/dto/PhotosPhotoFeedGetResponseDto;)Lcom/vk/dto/common/data/VKList;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, com.vk.channels.impl.channel_screen.send_msg.a.class, "onOptionSelected", "onOptionSelected(Lcom/vk/dto/im/MsgType;)V", 0);
                break;
            case 14:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 15:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
