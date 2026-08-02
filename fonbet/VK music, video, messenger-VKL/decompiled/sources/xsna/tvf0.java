package xsna;

import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;

/* compiled from: RemoteNewsEntriesStatContainer.kt */
/* loaded from: classes3.dex */
public final class tvf0 extends x960 {
    public final NewsEntriesContainer c;
    public final awq d;

    public tvf0(NewsEntriesContainer newsEntriesContainer, awq awqVar) {
        super(newsEntriesContainer, awqVar);
        this.c = newsEntriesContainer;
        this.d = awqVar;
    }

    @Override // xsna.x960
    public final NewsEntriesContainer a() {
        return this.c;
    }

    @Override // xsna.x960
    public final awq b() {
        return this.d;
    }
}
