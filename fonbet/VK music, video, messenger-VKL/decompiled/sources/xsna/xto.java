package xsna;

import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.design.view.newsfeed.dzen.storyitem.DzenStoryItemView;
import xsna.tlo0;

/* compiled from: DzenStoryItemHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class xto extends ol60 {
    public final a h;
    public final DzenStoryItemView.TitleStyle i;
    public final tlo0.h j;
    public final tlo0.h k;
    public final DzenStory.DzenStoryItem l;
    public final int m;

    /* compiled from: DzenStoryItemHolderUiDto.kt */
    public interface a {

        /* compiled from: DzenStoryItemHolderUiDto.kt */
        /* renamed from: xsna.xto$a$a, reason: collision with other inner class name */
        public static final class C4047a implements a {
            public final String a;

            public C4047a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4047a) && epx.f(this.a, ((C4047a) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Image(url="), this.a, ')');
            }
        }
    }

    public xto(a.C4047a c4047a, DzenStoryItemView.TitleStyle titleStyle, tlo0.h hVar, tlo0.h hVar2, DzenStory.DzenStoryItem dzenStoryItem, int i) {
        super(243, 0, 0, 0, null);
        this.h = c4047a;
        this.i = titleStyle;
        this.j = hVar;
        this.k = hVar2;
        this.l = dzenStoryItem;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xto)) {
            return false;
        }
        xto xtoVar = (xto) obj;
        return epx.f(this.h, xtoVar.h) && this.i == xtoVar.i && epx.f(this.j, xtoVar.j) && epx.f(this.k, xtoVar.k) && epx.f(this.l, xtoVar.l) && this.m == xtoVar.m;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        a aVar = this.h;
        return Integer.hashCode(0) + shy.a(this.m, (this.l.hashCode() + u11.c(u11.c((this.i.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31, 31, this.j.a), 31, this.k.a)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenStoryItemHolderUiDto(content=");
        sb.append(this.h);
        sb.append(", titleStyle=");
        sb.append(this.i);
        sb.append(", title=");
        sb.append(this.j);
        sb.append(", subtitle=");
        sb.append(this.k);
        sb.append(", storyItem=");
        sb.append(this.l);
        sb.append(", storyItemIndex=");
        return h5s.c(this.m, ", seqId=0)", sb);
    }
}
