package xsna;

import android.net.Uri;
import android.widget.AbsListView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.imageloader.view.VKImageView;
import java.util.LinkedList;

/* compiled from: ListPreloader.java */
/* loaded from: classes8.dex */
public final class bgz implements AbsListView.OnScrollListener {
    public zzc0 c;
    public int d;
    public int e;
    public int f;
    public boolean g = true;
    public final LinkedList b = new LinkedList();

    public final void a(int i, boolean z) {
        int min;
        int i2;
        if (this.g != z) {
            this.g = z;
            while (true) {
                LinkedList linkedList = this.b;
                if (linkedList.isEmpty()) {
                    break;
                }
                zuk zukVar = (zuk) linkedList.poll();
                if (zukVar != null) {
                    zukVar.close();
                }
            }
        }
        int i3 = (z ? 25 : -25) + i;
        if (i < i3) {
            i2 = Math.max(this.d, i);
            min = i3;
        } else {
            min = Math.min(this.e, i);
            i2 = i3;
        }
        int itemCount = this.c.getItemCount();
        int min2 = Math.min(itemCount, min);
        int min3 = Math.min(itemCount, Math.max(0, i2));
        if (i < i3) {
            for (int i4 = min3; i4 < min2; i4++) {
                b(i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                b(i5, false);
            }
        }
        this.e = min3;
        this.d = min2;
    }

    public final void b(int i, boolean z) {
        int G = this.c.G(i);
        if (z) {
            for (int i2 = 0; i2 < G; i2++) {
                c(this.c.B(i, i2));
            }
            return;
        }
        for (int i3 = G - 1; i3 >= 0; i3--) {
            c(this.c.B(i, i3));
        }
    }

    public final void c(String str) {
        zuk zukVar;
        if (str == null) {
            return;
        }
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        int i = VKImageView.l;
        h.e = eng0.c;
        ae g = rhs.b().g(h.a());
        LinkedList linkedList = this.b;
        if (linkedList.size() > 25 && (zukVar = (zuk) linkedList.poll()) != null) {
            zukVar.close();
        }
        linkedList.offer(g);
    }

    public final void d(int i, int i2) {
        if (this.c == null) {
            return;
        }
        while (true) {
            LinkedList linkedList = this.b;
            if (linkedList.isEmpty()) {
                a(i + i2, true);
                return;
            } else {
                zuk zukVar = (zuk) linkedList.poll();
                if (zukVar != null) {
                    zukVar.close();
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.c != null) {
            int i4 = this.f;
            if (i > i4) {
                a(i2 + i, true);
            } else if (i < i4) {
                a(i, false);
            }
            this.f = i;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
