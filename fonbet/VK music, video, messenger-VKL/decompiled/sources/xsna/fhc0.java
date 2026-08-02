package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.ghc0;

/* compiled from: PostingMetricsCollector.kt */
/* loaded from: classes18.dex */
public interface fhc0 {

    /* compiled from: PostingMetricsCollector.kt */
    public interface a {
        void a(GeoAttachment geoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void b(VideoAttachment videoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void c(LinkAttachment linkAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void d(PhotoAttachment photoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void e(ArticleAttachment articleAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void f(PollAttachment pollAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void g(MarketAttachment marketAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void h(AudioAttachment audioAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void i(VideoAttachment videoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void j(PhotoAttachment photoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void k(AlbumAttachment albumAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void l(AudioPlaylistAttachment audioPlaylistAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void m(MarketMessageOwnerAttachment marketMessageOwnerAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void n(SnippetAttachment snippetAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void o(Attachment attachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void p(DocumentAttachment documentAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);
    }

    /* compiled from: PostingMetricsCollector.kt */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();
    }

    /* compiled from: PostingMetricsCollector.kt */
    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();
    }

    /* compiled from: PostingMetricsCollector.kt */
    public interface d {
        void a();

        void b();

        void c();
    }

    /* compiled from: PostingMetricsCollector.kt */
    public interface e {
        void a(String str, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void b(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void c(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void d(long j, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void e(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void f(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void g(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void h(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void i(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void j(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void k(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);

        void l(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint);
    }

    ghc0.f a();

    ghc0.a b();

    void c(UserId userId);

    ghc0.i d();

    ghc0.e e();

    ghc0.d f();

    ghc0.g g();

    ghc0.b h();

    void i(Integer num);

    ghc0.j x();
}
