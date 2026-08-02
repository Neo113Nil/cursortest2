package xsna;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import java.util.ArrayList;
import xsna.as30;

/* compiled from: ListMediaPlayer.kt */
/* loaded from: classes2.dex */
public interface xfz<MediaData> {
    void a();

    void c(RecyclerView recyclerView);

    void d(String str);

    void e(Activity activity, RecyclerView recyclerView);

    void onDestroy();

    void onPause();

    void onResume();

    /* compiled from: ListMediaPlayer.kt */
    public interface a<MediaData> {

        /* compiled from: ListMediaPlayer.kt */
        /* renamed from: xsna.xfz$a$a, reason: collision with other inner class name */
        public static final class C4001a {
            public final int a;
            public final int b;
            public final int c;
            public final int d;

            public C4001a() {
                this(0, 0, 0, 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4001a)) {
                    return false;
                }
                C4001a c4001a = (C4001a) obj;
                return this.a == c4001a.a && this.b == c4001a.b && this.c == c4001a.c && this.d == c4001a.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PlayerBubbleColors(textTime=");
                sb.append(this.a);
                sb.append(", textPrimary=");
                sb.append(this.b);
                sb.append(", bubbleAccent=");
                sb.append(this.c);
                sb.append(", textSecondary=");
                return vu5.b(sb, this.d, ')');
            }

            public C4001a(int i, int i2, int i3, int i4) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }
        }

        void bind(MediaData mediadata);

        dnt0 getPresenter();

        View i(MsgBubbleView msgBubbleView, as30.a aVar);

        default void b() {
        }

        default void a(C4001a c4001a) {
        }

        default void g(ArrayList arrayList) {
        }
    }
}
