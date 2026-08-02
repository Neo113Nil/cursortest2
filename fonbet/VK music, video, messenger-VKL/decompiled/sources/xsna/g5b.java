package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g5b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ g5b(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        switch (this.b) {
            case 0:
                o5b o5bVar = (o5b) obj;
                ArrayList arrayList = emi.y(this.c).c;
                com.vk.channels.impl.channel_screen.search.a aVar = com.vk.channels.impl.channel_screen.search.a.a;
                List<Msg> list = o5bVar.a;
                aVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Msg msg : list) {
                    CnvMsgId n = k9q0.n(msg);
                    if (msg instanceof MsgFromChannel) {
                        try {
                            charSequence = com.vk.channels.impl.channel_screen.search.a.a((MsgFromChannel) msg, arrayList);
                        } catch (Exception e) {
                            com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Channel search formatting failed", e));
                            charSequence = ((MsgFromChannel) msg).I.a;
                        }
                    } else {
                        charSequence = "...";
                    }
                    linkedHashMap.put(n, charSequence);
                }
                return new Pair(o5bVar, linkedHashMap);
            case 1:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                String str = this.c;
                return (str != null ? new io.reactivex.rxjava3.internal.operators.single.v(new x8f(str, 0)) : new io.reactivex.rxjava3.internal.operators.single.v(new y8f())).l(new t34(new lz0(clipVideoFile, 22), 10));
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                String str2 = this.c;
                if (str2 != null) {
                    qgi0.h(tgi0Var, str2);
                }
                return s3q0.a;
            default:
                return new OfflineAudioBookChaptersMviState.Loading(this.c, null, 2, null);
        }
    }

    public /* synthetic */ g5b(a9f a9fVar, String str) {
        this.b = 1;
        this.c = str;
    }
}
