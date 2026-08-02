package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.views.GalleryRoundImageView;

/* loaded from: classes15.dex */
public final class ors extends RecyclerView.Adapter {
    public final h3y a;
    public final Context b;
    public final x22 c;
    public t15 w;
    public boolean x;
    public PlainMessage.Item[] y = new PlainMessage.Item[0];
    public int z = -1;

    public ors(h3y h3yVar, Context context, lqo lqoVar, x22 x22Var) {
        this.a = h3yVar;
        this.b = context;
        this.c = x22Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.y.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        boolean z;
        dss dssVar = (dss) x0Var;
        PlainMessage.Image image = this.y[i].image;
        int i2 = this.z;
        boolean z2 = this.x;
        t15 t15Var = this.w;
        if (t15Var == null) {
            t15Var = null;
        }
        t15 t15Var2 = t15Var;
        final GalleryRoundImageView galleryRoundImageView = dssVar.O;
        dssVar.Q = t15Var2;
        dssVar.P.l = z2;
        boolean z3 = false;
        if (dssVar.F() != i2 || image.height > image.width) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        String f = b.f(image.fileInfo.id2);
        galleryRoundImageView.bindData(new urs(image.width, image.height, dssVar.F() != i2 ? z : true));
        PlainMessage.FileInfo fileInfo = image.fileInfo;
        String str = fileInfo.name;
        if (str == null && (str = fileInfo.id2) == null) {
            str = "";
        }
        galleryRoundImageView.setTransitionName(str);
        final glr glrVar = new glr(z3, dssVar, image, f, t15Var2, 1);
        galleryRoundImageView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.messaging.extension.view.ViewExtensionsKt$onPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                galleryRoundImageView.getViewTreeObserver().removeOnPreDrawListener(this);
                glrVar.invoke();
                return true;
            }
        });
        galleryRoundImageView.setOnLongClickListener(new ly4(5, t15Var2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new dss(LayoutInflater.from(this.b).inflate(olh0.msg_vh_gallery_item, viewGroup, false), this.a, this.c);
    }
}
