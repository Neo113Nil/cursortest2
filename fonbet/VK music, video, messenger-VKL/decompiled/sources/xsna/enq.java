package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.ironsource.InterfaceC4319fe;
import com.vk.core.preference.Preference;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FavePage;
import com.vk.log.L;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: FaveControllerImpl.kt */
/* loaded from: classes18.dex */
public final class enq implements ymq {
    public static final enq a = new enq();
    public static final fdi b = new fdi();
    public static final nsq c = new nsq();

    public static void b(Context context, io.reactivex.rxjava3.disposables.c cVar) {
        Context h = context != null ? e3m.h(context) : null;
        VKActivity vKActivity = h instanceof VKActivity ? (VKActivity) h : null;
        if (vKActivity != null) {
            vKActivity.p.b(cVar);
        }
    }

    public static void c(gmq gmqVar) {
        VideoFileOld videoFileOld;
        ce60.b.getClass();
        p870 f = p870.f();
        gnq.a.getClass();
        String h = gnq.e(gmqVar).h();
        xuo0.a.getClass();
        f.e(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, new FaveEntry(new FaveItem(h, false, xuo0.c(), new ArrayList(), gmqVar), false, gnq.b(gmqVar)));
        VideoFile videoFile = gmqVar instanceof VideoSnippetAttachment ? ((VideoSnippetAttachment) gmqVar).k : gmqVar instanceof VideoAttachment ? ((VideoAttachment) gmqVar).k : null;
        if (videoFile == null) {
            videoFile = null;
        }
        if (videoFile != null) {
            videoFileOld = videoFile.copy();
            videoFileOld.A0 = SystemClock.elapsedRealtime();
        } else {
            videoFileOld = null;
        }
        if (videoFileOld != null) {
            wjs0.a(gmqVar.X() ? new axr0(videoFileOld) : new cxr0(videoFileOld));
            wjs0.a(new fyr0(videoFileOld));
        }
        fy00 U1 = ((MarketComponent) ((k7m) m7m.f(new dnq())).a(fpf0.a(MarketComponent.class))).U1();
        MarketFavable marketFavable = gmqVar instanceof MarketFavable ? (MarketFavable) gmqVar : null;
        if (marketFavable != null) {
            U1.b(new hy00(marketFavable.b, marketFavable.c, marketFavable.f));
        }
    }

    public static FaveCategory d() {
        String s;
        s = Preference.s("fave_pref", "last_category", new String());
        FaveCategory.Companion.getClass();
        return FaveCategory.a.b(s);
    }

    public static void e(FaveTag faveTag) {
        p870.f().e(InterfaceC4319fe.a.b, faveTag);
    }

    public static final boolean f() {
        return !tmq.a().k();
    }

    public static final void g(Context context, gmq gmqVar, pqq pqqVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, izs<? super gmq, s3q0> izsVar) {
        j(context, gmqVar, pqqVar, new mq2(5), izsVar, false, wzsVar, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(Context context, gmq gmqVar, pqq pqqVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, izs<? super gmq, s3q0> izsVar, boolean z, wzs<? super Boolean, ? super gmq, s3q0> wzsVar2) {
        boolean z2;
        rsg0 cub0Var;
        rsg0 imqVar;
        rsg0 cub0Var2;
        io.reactivex.rxjava3.disposables.c subscribe;
        tfx tfxVar;
        tfx tfxVar2;
        String str = pqqVar.a;
        String str2 = pqqVar.c;
        String str3 = pqqVar.b;
        boolean X = gmqVar.X();
        enq enqVar = a;
        if (!X) {
            enqVar.getClass();
            if (gmqVar instanceof Post) {
                Post post = (Post) gmqVar;
                int i = post.n;
                UserId userId = post.m;
                String str4 = post.L.b;
                sga0 sga0Var = new sga0("fave.addPost");
                sga0Var.C(i, "id");
                sga0Var.F(userId, "owner_id");
                if (str != null) {
                    sga0Var.K("access_key", str);
                }
                if (str4 != null) {
                    sga0Var.K("track_code", str4);
                }
                if (str3 != null) {
                    sga0Var.K("ref", str3);
                }
                z2 = X;
                imqVar = sga0Var;
            } else if (gmqVar instanceof ArticleAttachment) {
                String str5 = ((ArticleAttachment) gmqVar).f.i;
                if (str5 != null) {
                    imqVar = new qf3("fave.addArticle", 2);
                    imqVar.K("url", str5);
                    if (str != null && str.length() != 0) {
                        imqVar.K("access_key", str);
                    }
                    if (str2 != null && str2.length() != 0) {
                        imqVar.K("track_code", str2);
                    }
                    if (str3 != null && str3.length() != 0) {
                        imqVar.K("ref", str3);
                    }
                    if (str3 != null && str3.length() != 0) {
                        imqVar.K("ref", str3);
                    }
                }
                z2 = X;
                imqVar = null;
            } else {
                if (gmqVar instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) gmqVar;
                    String str6 = snippetAttachment.f.b;
                    if (str6 != null) {
                        cub0Var = new rqq(str6, snippetAttachment.p, snippetAttachment.g, pqqVar.a, pqqVar.c, pqqVar.b);
                        z2 = X;
                    }
                    z2 = X;
                    imqVar = null;
                } else {
                    if (gmqVar instanceof abz) {
                        cub0Var2 = new rqq(null, null, null, pqqVar.a, pqqVar.c, pqqVar.b);
                    } else if (gmqVar instanceof FaveMarketItem) {
                        Good good = ((FaveMarketItem) gmqVar).b;
                        cub0Var2 = new cub0(good.b, good.c, pqqVar.a, pqqVar.b, pqqVar.c);
                    } else if (gmqVar instanceof VideoAttachment) {
                        VideoFile videoFile = ((VideoAttachment) gmqVar).k;
                        if (videoFile.C2()) {
                            int o0 = videoFile.o0();
                            UserId I0 = videoFile.I0();
                            z2 = X;
                            imqVar = new hq3("fave.addClip", 2, (byte) 0);
                            imqVar.C(o0, "id");
                            imqVar.F(I0, "owner_id");
                            if (str != null && str.length() != 0) {
                                imqVar.K("access_key", str);
                            }
                            if (str3 != null && str3.length() != 0) {
                                imqVar.K("ref", str3);
                            }
                            if (str2 != null && str2.length() != 0) {
                                imqVar.K("track_code", str2);
                            }
                        } else {
                            z2 = X;
                            int o02 = videoFile.o0();
                            UserId I02 = videoFile.I0();
                            mmq mmqVar = new mmq("fave.addVideo", 0);
                            mmqVar.C(o02, "id");
                            mmqVar.F(I02, "owner_id");
                            if (str != null && str.length() != 0) {
                                mmqVar.K("access_key", str);
                            }
                            if (str3 != null && str3.length() != 0) {
                                mmqVar.K("ref", str3);
                            }
                            if (str2 != null && str2.length() != 0) {
                                mmqVar.K("track_code", str2);
                            }
                            imqVar = mmqVar;
                        }
                    } else {
                        z2 = X;
                        if (gmqVar instanceof PodcastAttachment) {
                            MusicTrack musicTrack = ((PodcastAttachment) gmqVar).f;
                            imqVar = new kmq(musicTrack.c, musicTrack.b, str3, str2);
                        } else if (gmqVar instanceof Narrative) {
                            Narrative narrative = (Narrative) gmqVar;
                            UserId userId2 = narrative.c;
                            int i2 = narrative.b;
                            imqVar = new imq("fave.addNarrative");
                            imqVar.F(userId2, "owner_id");
                            imqVar.C(i2, "narrative_id");
                            if (str3 != null && str3.length() != 0) {
                                imqVar.K("ref", str3);
                            }
                            if (str2 != null && str2.length() != 0) {
                                imqVar.K("track_code", str2);
                            }
                        } else if (gmqVar instanceof EventAttachment) {
                            cub0Var = new jmq(((EventAttachment) gmqVar).f.b, pqqVar.b, pqqVar.c, null, null);
                        } else if (gmqVar instanceof e9z) {
                            cub0Var = new rqq(((e9z) gmqVar).b, null, null, pqqVar.a, pqqVar.c, pqqVar.b);
                        } else {
                            if (gmqVar instanceof MarketFavable) {
                                MarketFavable marketFavable = (MarketFavable) gmqVar;
                                cub0Var = new cub0(marketFavable.b, marketFavable.c, pqqVar.a, pqqVar.b, pqqVar.c);
                            }
                            imqVar = null;
                        }
                    }
                    imqVar = cub0Var2;
                }
                imqVar = cub0Var;
            }
            boolean z3 = !z2;
            if (wzsVar != null) {
            }
            if (imqVar == null) {
                return;
            } else {
                return;
            }
        }
        enqVar.getClass();
        boolean z4 = gmqVar instanceof Post;
        fdi fdiVar = b;
        if (z4) {
            Post post2 = (Post) gmqVar;
            UserId userId3 = post2.m;
            int i3 = post2.n;
            fdiVar.getClass();
            tfx tfxVar3 = new tfx("fave.removePost", new ar(14), new br(17));
            tfx.n(tfxVar3, "owner_id", userId3, 0L, 0L, 12);
            tfx.l(tfxVar3, "id", i3, 0, 0, 12);
            if (str3 != null) {
                tfx.o(tfxVar3, "ref", str3, 0, 0, 12);
            }
            if (str2 != null) {
                tfx.o(tfxVar3, "track_code", str2, 0, 0, 12);
                tfxVar2 = tfxVar3;
            } else {
                tfxVar2 = tfxVar3;
            }
            imqVar = yfb.y(tfxVar2, new f57(22));
        } else {
            if (!(gmqVar instanceof ArticleAttachment)) {
                if (gmqVar instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment2 = (SnippetAttachment) gmqVar;
                    String str7 = snippetAttachment2.f.b;
                    if (str7 != null) {
                        imqVar = new u20(str7, snippetAttachment2.x, str3);
                    }
                    imqVar = null;
                } else if (gmqVar instanceof LinkAttachment) {
                    String str8 = ((LinkAttachment) gmqVar).f.b;
                    if (str8 != null) {
                        imqVar = new u20(str8, null, str3);
                    }
                    imqVar = null;
                } else if (gmqVar instanceof abz) {
                    imqVar = new u20(null, null, str3);
                } else if (gmqVar instanceof FaveMarketItem) {
                    Good good2 = ((FaveMarketItem) gmqVar).b;
                    imqVar = new pea0(good2.b, good2.c, str3);
                } else if (gmqVar instanceof VideoAttachment) {
                    VideoFile videoFile2 = ((VideoAttachment) gmqVar).k;
                    if (videoFile2.C2()) {
                        UserId I03 = videoFile2.I0();
                        int o03 = videoFile2.o0();
                        fdiVar.getClass();
                        tfxVar = new tfx("fave.removeClip", new cr(13), new io.reactivex.rxjava3.internal.operators.observable.n0(21));
                        tfx.n(tfxVar, "owner_id", I03, 0L, 0L, 12);
                        tfx.l(tfxVar, "id", o03, 0, 0, 12);
                        if (str3 != null) {
                            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
                        }
                        if (str2 != null) {
                            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
                            tfxVar = tfxVar;
                        }
                    } else {
                        UserId I04 = videoFile2.I0();
                        int o04 = videoFile2.o0();
                        fdiVar.getClass();
                        tfxVar = new tfx("fave.removeVideo", new dr(16), new com.vk.movika.sdk.android.defaultplayer.view.a(16));
                        tfx.n(tfxVar, "owner_id", I04, 0L, 0L, 12);
                        tfx.l(tfxVar, "id", o04, 0, 0, 12);
                        if (str3 != null) {
                            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
                        }
                    }
                    imqVar = yfb.y(tfxVar, new wq3(24));
                } else if (gmqVar instanceof PodcastAttachment) {
                    MusicTrack musicTrack2 = ((PodcastAttachment) gmqVar).f;
                    imqVar = new lrq(musicTrack2.c, musicTrack2.b, str3);
                } else if (gmqVar instanceof Narrative) {
                    Narrative narrative2 = (Narrative) gmqVar;
                    UserId userId4 = narrative2.c;
                    int i4 = narrative2.b;
                    imqVar = new krq("fave.removeNarrative");
                    imqVar.F(userId4, "owner_id");
                    imqVar.C(i4, "narrative_id");
                    imqVar.K("ref", str3);
                } else if (gmqVar instanceof EventAttachment) {
                    imqVar = new qea0(((EventAttachment) gmqVar).f.b, pqqVar.b, (String) null, (String) null, (String) null);
                } else if (gmqVar instanceof MarketFavable) {
                    MarketFavable marketFavable2 = (MarketFavable) gmqVar;
                    imqVar = new pea0(marketFavable2.b, marketFavable2.c, str3);
                } else {
                    if (gmqVar instanceof e9z) {
                        imqVar = new u20(((e9z) gmqVar).b, null, str3);
                    }
                    imqVar = null;
                }
                boolean z32 = !z2;
                if (wzsVar != null) {
                    wzsVar.invoke(Boolean.valueOf(z32), gmqVar);
                }
                if (imqVar == null || (subscribe = rsg0.y0(imqVar, null, null, 3).subscribe(new xn(new zmq(gmqVar, z32, wzsVar2, z, context, pqqVar, izsVar), 19), new t00(new u9(15, izsVar, gmqVar), 28))) == null) {
                    return;
                }
                enqVar.getClass();
                b(context, subscribe);
                return;
            }
            Article article = ((ArticleAttachment) gmqVar).f;
            int i5 = article.b;
            UserId userId5 = article.c;
            imqVar = new jrq("fave.removeArticle");
            imqVar.C(i5, "article_id");
            imqVar.F(userId5, "owner_id");
            if (str3 != null && str3.length() != 0) {
                imqVar.K("ref", str3);
            }
            if (str2 != null && str2.length() != 0) {
                imqVar.K("track_code", str2);
            }
        }
        z2 = X;
        boolean z322 = !z2;
        if (wzsVar != null) {
        }
        if (imqVar == null) {
        }
    }

    public static /* synthetic */ void j(Context context, gmq gmqVar, pqq pqqVar, wzs wzsVar, izs izsVar, boolean z, wzs wzsVar2, int i) {
        if ((i & 32) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            wzsVar2 = null;
        }
        h(context, gmqVar, pqqVar, wzsVar, izsVar, z2, wzsVar2);
    }

    public static final void k(Context context, FavePage favePage, pqq pqqVar, wzs<? super Boolean, ? super UserId, s3q0> wzsVar, izs<? super UserId, s3q0> izsVar, boolean z, String str, String str2, String str3) {
        boolean z2 = favePage.h;
        Owner owner = favePage.e;
        if (owner == null) {
            L.l("Can't toggleProfile without owner");
        }
        if (owner == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(z2 ? new qea0(owner.b, pqqVar.b, str, str2, str3) : new jmq(owner.b, pqqVar.b, str, str2, str3), null, null, 3), context, 0L, false, 62).subscribe(new om1(new anq(z2, favePage, z, context, pqqVar, wzsVar, owner, izsVar), 17), new pm1(new o9(20, izsVar, owner), 20));
        a.getClass();
        b(context, subscribe);
    }

    @Override // xsna.ymq
    public final boolean a() {
        return !tmq.a().k();
    }
}
