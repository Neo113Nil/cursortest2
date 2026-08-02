package xsna;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ViewGroup;
import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import com.vk.api.generated.wall.dto.WallPostResponseDto;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.media.qrcode.QRCodeGenerate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.vqw0;
import xsna.zmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class anw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ anw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                zmw0.a aVar = (zmw0.a) obj2;
                izs<mlp, s3q0> izsVar = aVar.h;
                Handler handler = bnw0.a;
                izsVar.invoke(bnw0.b(aVar, EmptyList.b));
                return s3q0.a;
            case 1:
                pqw0 pqw0Var = (pqw0) obj2;
                MessagesScheduledCallItemDto messagesScheduledCallItemDto = (MessagesScheduledCallItemDto) obj;
                pqw0Var.T(new vqw0.b(messagesScheduledCallItemDto.D(), messagesScheduledCallItemDto.l(), new SimpleDateFormat("dd MMMM HH:mm", Locale.getDefault()).format(new Date(messagesScheduledCallItemDto.u().g())), messagesScheduledCallItemDto));
                pqw0Var.T(new vqw0.c(QRCodeGenerate.b()));
                return s3q0.a;
            case 2:
                return new b0x0((ViewGroup) obj, ((uzw0) obj2).i);
            default:
                Post post = (Post) obj2;
                xuo0.a.getClass();
                int c = (int) xuo0.c();
                Post Nb = Post.Nb(post, new Flags(post.l.b), null, ((WallPostResponseDto) obj).d(), null, c, EntryHeader.a(post.y, null, null, Integer.valueOf(c), 447), null, null, null, -8262);
                Flags flags = Nb.l;
                flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, false);
                boolean z = !flags.zb(16777216L);
                flags.Ab(2L, z);
                flags.Ab(4294967296L, z);
                return Nb;
        }
    }
}
