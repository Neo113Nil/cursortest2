package xsna;

import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: CommentDisplayItem.kt */
/* loaded from: classes3.dex */
public class cbg {
    public final iag a;
    public iag b;
    public final int c;
    public Boolean d;
    public bbg e;

    public cbg(iag iagVar, iag iagVar2, int i) {
        this.a = iagVar;
        this.b = iagVar2;
        this.c = i;
    }

    public /* synthetic */ cbg(iag iagVar, int i, int i2) {
        this((i2 & 1) != 0 ? new NewsComment() : iagVar, (iag) null, i);
    }
}
