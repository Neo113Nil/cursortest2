package xsna;

import android.app.Activity;
import com.ironsource.X3;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import xsna.pdm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zkb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zkb(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Integer valueOf;
        int i2;
        Integer valueOf2;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                int i3 = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT * \n        FROM audio_book_chapter\n        INNER JOIN audio_book_to_chapters \n        ON audio_book_chapter.chapter_id = audio_book_to_chapters.chapter_id\n        AND audio_book_chapter.uid = audio_book_to_chapters.uid\n        WHERE audio_book_to_chapters.uid = ? \n        AND audio_book_to_chapters.book_id = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.bindLong(2, i3);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "chapter_id");
                    int k4 = egi.k(V0, "title");
                    int k5 = egi.k(V0, "url");
                    int k6 = egi.k(V0, "duration");
                    int k7 = egi.k(V0, "progress_time");
                    int k8 = egi.k(V0, "progress_status");
                    int k9 = egi.k(V0, "track_code");
                    int k10 = egi.k(V0, "special_project_id");
                    int k11 = egi.k(V0, "context_flags_mask");
                    int k12 = egi.k(V0, "manifest_url");
                    int k13 = egi.k(V0, "downloading_state");
                    int k14 = egi.k(V0, X3.a.k);
                    int k15 = egi.k(V0, "json_raw");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i4 = k13;
                        ArrayList arrayList2 = arrayList;
                        int i5 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.l2(k4);
                        String str2 = null;
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        if (V0.isNull(k6)) {
                            i = i5;
                            valueOf = null;
                        } else {
                            i = i5;
                            valueOf = Integer.valueOf((int) V0.getLong(k6));
                        }
                        int i6 = (int) V0.getLong(k7);
                        String l24 = V0.l2(k8);
                        String l25 = V0.isNull(k9) ? null : V0.l2(k9);
                        if (V0.isNull(k10)) {
                            i2 = i6;
                            valueOf2 = null;
                        } else {
                            i2 = i6;
                            valueOf2 = Integer.valueOf((int) V0.getLong(k10));
                        }
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        String l26 = V0.isNull(k12) ? null : V0.l2(k12);
                        int i7 = k;
                        int i8 = (int) V0.getLong(i4);
                        if (i8 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i8 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i8 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i8 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i8 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        if (!V0.isNull(k14)) {
                            str2 = V0.l2(k14);
                        }
                        int i9 = k15;
                        arrayList2.add(new flb(i, b, l2, l22, l23, valueOf, i2, l24, l25, valueOf2, valueOf3, l26, downloadingState2, uh.a(str2), V0.l2(i9)));
                        arrayList = arrayList2;
                        k13 = i4;
                        k15 = i9;
                        k = i7;
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                spm spmVar = (spm) obj;
                int i10 = pdm.a.$EnumSwitchMapping$0[((DialogsCounters.Type) this.d).ordinal()];
                int i11 = this.c;
                return i10 != 1 ? i10 != 2 ? spmVar : spm.a(spmVar, 0, spmVar.c + i11, 3) : spm.a(spmVar, spmVar.b + i11, 0, 5);
            case 2:
                com.vk.core.dynamic_loader.b.e().c((olk0) this.d, (Activity) obj, this.c);
                return s3q0.a;
            default:
                xii0 xii0Var = (xii0) this.d;
                MessagesGetConversationsResponseDto messagesGetConversationsResponseDto = (MessagesGetConversationsResponseDto) obj;
                MapBuilder a = xii0Var.a(messagesGetConversationsResponseDto.g(), messagesGetConversationsResponseDto.e(), messagesGetConversationsResponseDto.d());
                Integer valueOf4 = Integer.valueOf(messagesGetConversationsResponseDto.getCount());
                ListBuilder e = e43.e();
                if (this.c == 0) {
                    e.add(xii0Var.h);
                }
                List<MessagesConversationWithMessageDto> f = messagesGetConversationsResponseDto.f();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : f) {
                    if (!epx.f(((MessagesConversationWithMessageDto) obj2).d().g().d(), xii0Var.f.getUid())) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    e.add(xii0.b(((MessagesConversationWithMessageDto) it.next()).d(), a));
                    arrayList4.add(Boolean.TRUE);
                }
                return new Pair(valueOf4, e.g());
        }
    }

    public /* synthetic */ zkb(String str, int i, elb elbVar) {
        this.b = 0;
        this.d = str;
        this.c = i;
    }
}
