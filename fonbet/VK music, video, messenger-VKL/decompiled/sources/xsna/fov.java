package xsna;

import android.view.View;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stories.model.GifItem;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.Set;

/* compiled from: ISelectionStickerView.kt */
/* loaded from: classes18.dex */
public interface fov {

    /* compiled from: ISelectionStickerView.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(int i, int i2, String str, String str2, String str3) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('_');
            sb.append(i2);
            this.f = sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StickerModel(packId=");
            sb.append(this.a);
            sb.append(", stickerId=");
            sb.append(this.b);
            sb.append(", url=");
            sb.append(this.c);
            sb.append(", urlAnimation=");
            sb.append(this.d);
            sb.append(", vmojiCharacter=");
            return ho8.a(sb, this.e, ')');
        }
    }

    void a(Set<? extends WebStickerType> set);

    boolean a0();

    void b();

    void c(boolean z);

    void d();

    View getView();

    void hide();

    default boolean isVisible() {
        return getView().getVisibility() == 0;
    }

    default void setVisible(boolean z) {
        getView().setVisibility(z ? 0 : 8);
    }

    void show();

    /* compiled from: ISelectionStickerView.kt */
    public interface a {
        void a();

        void b();

        void c();

        void close();

        void d(VmojiAvatar vmojiAvatar);

        void e();

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();

        void l(String str, String str2);

        void m(GifItem gifItem);

        void n();

        void p();

        void q(b bVar);

        default void o() {
        }
    }
}
