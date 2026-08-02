package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.photoviewer.PhotoViewer;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FrameViewerPage.kt */
/* loaded from: classes3.dex */
public abstract class ggs extends FrameLayout {
    public int b;
    public PhotoViewer.g c;

    public ggs(Context context, int i, PhotoViewer.g gVar) {
        super(context);
        this.b = i;
        this.c = gVar;
    }

    public final PhotoViewer.g getMedia() {
        return this.c;
    }

    public final int getPosition() {
        return this.b;
    }

    public List<View> getViewsForFade() {
        return EmptyList.b;
    }

    public List<View> getViewsForTranslate() {
        return EmptyList.b;
    }

    public final void setMedia(PhotoViewer.g gVar) {
        this.c = gVar;
    }

    public final void setPosition(int i) {
        this.b = i;
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }
}
