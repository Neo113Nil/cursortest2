package xsna;

import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;

/* compiled from: InterestingStoriesBlockItem.kt */
/* loaded from: classes18.dex */
public interface aex {

    /* compiled from: InterestingStoriesBlockItem.kt */
    public static abstract class a implements aex {
        public Long a;
        public Long b;

        /* compiled from: InterestingStoriesBlockItem.kt */
        /* renamed from: xsna.aex$a$a, reason: collision with other inner class name */
        public static final class C2538a extends a {
            public final int c;
            public final StoryEntry d;
            public final ArrayList e;

            public C2538a(int i, StoryEntry storyEntry, ArrayList arrayList) {
                this.c = i;
                this.d = storyEntry;
                this.e = arrayList;
            }

            @Override // xsna.aex.a
            public final StoryEntry b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2538a)) {
                    return false;
                }
                C2538a c2538a = (C2538a) obj;
                return this.c == c2538a.c && epx.f(this.d, c2538a.d) && epx.f(this.e, c2538a.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + (Integer.hashCode(this.c) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Photo(id=");
                sb.append(this.c);
                sb.append(", story=");
                sb.append(this.d);
                sb.append(", photo=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
            }
        }

        /* compiled from: InterestingStoriesBlockItem.kt */
        public static final class b extends a {
            public final int c;
            public final StoryEntry d;
            public final VideoAttachment e;

            public b(int i, StoryEntry storyEntry, VideoAttachment videoAttachment) {
                this.c = i;
                this.d = storyEntry;
                this.e = videoAttachment;
            }

            @Override // xsna.aex.a
            public final StoryEntry b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + (Integer.hashCode(this.c) * 31)) * 31);
            }

            public final String toString() {
                return "Video(id=" + this.c + ", story=" + this.d + ", videoFile=" + this.e + ')';
            }
        }

        public final rdx a() {
            Long l = this.a;
            Long l2 = this.b;
            if (l == null || l2 == null) {
                return null;
            }
            return new rdx(l.longValue(), l2.longValue());
        }

        public abstract StoryEntry b();
    }

    /* compiled from: InterestingStoriesBlockItem.kt */
    public static final class b implements aex {
        public final DiscoverBlockType a;

        public b(DiscoverBlockType discoverBlockType) {
            this.a = discoverBlockType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowAll(blockType=" + this.a + ')';
        }
    }
}
