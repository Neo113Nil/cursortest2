package xsna;

import com.ironsource.X3;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.articles.dto.ArticlesGetOwnerPublishedResponseDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.r1r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uo3 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uo3(int i, wo3 wo3Var) {
        this.c = i;
        this.d = wo3Var;
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
                wo3 wo3Var = (wo3) this.d;
                ArticlesGetOwnerPublishedResponseDto articlesGetOwnerPublishedResponseDto = (ArticlesGetOwnerPublishedResponseDto) obj;
                List<ArticlesArticleDto> d = articlesGetOwnerPublishedResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (ArticlesArticleDto articlesArticleDto : d) {
                    wo3Var.h.getClass();
                    arrayList.add(ne7.B(articlesArticleDto, null));
                }
                return new wia0(arrayList, articlesGetOwnerPublishedResponseDto.getCount(), this.c == 0);
            case 1:
                String str = (String) this.d;
                int i3 = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT * \n        FROM audio_book_chapter\n        INNER JOIN audio_book_to_chapters \n        ON audio_book_chapter.chapter_id = audio_book_to_chapters.chapter_id \n        AND audio_book_chapter.uid = audio_book_to_chapters.uid\n        WHERE audio_book_to_chapters.uid = ? \n        AND audio_book_to_chapters.book_id = ?\n    ");
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
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        int i4 = k13;
                        ArrayList arrayList3 = arrayList2;
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
                        arrayList3.add(new flb(i, b, l2, l22, l23, valueOf, i2, l24, l25, valueOf2, valueOf3, l26, downloadingState2, uh.a(str2), V0.l2(i9)));
                        arrayList2 = arrayList3;
                        k13 = i4;
                        k15 = i9;
                        k = i7;
                    }
                    return arrayList2;
                } finally {
                    V0.close();
                }
            default:
                jp80 jp80Var = (jp80) this.d;
                List list = (List) obj;
                ArrayList arrayList4 = jp80Var.h;
                int size = list.size();
                int h = e43.h(list);
                int i10 = this.c;
                if (i10 > h) {
                    return io.reactivex.rxjava3.core.x.k(new jks(0, EmptyList.b, false));
                }
                int i11 = i10 + 30;
                int size2 = list.size();
                int i12 = i11 > size2 ? size2 : i11;
                return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(r1r0.a.b(jp80Var.d, list.subList(i10, i12), arrayList4, null, null, 58))), new ie40(new g110(jp80Var, i12, list, size), 3));
        }
    }

    public /* synthetic */ uo3(String str, int i, elb elbVar) {
        this.d = str;
        this.c = i;
    }

    public /* synthetic */ uo3(jp80 jp80Var, int i) {
        this.d = jp80Var;
        this.c = i;
    }
}
