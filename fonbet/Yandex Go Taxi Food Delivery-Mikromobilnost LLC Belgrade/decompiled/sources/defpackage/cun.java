package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.view.timeline.b;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.views.GalleryRoundImageView;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final /* synthetic */ class cun implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ cun(int i, dun dunVar, LinearLayout linearLayout, int i2, ImageView imageView) {
        this.b = i;
        this.w = dunVar;
        this.x = linearLayout;
        this.c = i2;
        this.y = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View childAt;
        nu10 h0;
        jcz0 jcz0Var;
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                dun dunVar = (dun) obj3;
                LinearLayout linearLayout = (LinearLayout) obj2;
                ImageView imageView = (ImageView) obj;
                if (i3 == 0) {
                    int i4 = dunVar.i;
                    childAt = i4 != -1 ? linearLayout.getChildAt(i4) : null;
                    dunVar.i = i2;
                } else {
                    int i5 = dunVar.j;
                    childAt = i5 != -1 ? linearLayout.getChildAt(i5) : null;
                    dunVar.j = i2;
                }
                if (childAt != null) {
                    childAt.setSelected(false);
                    childAt.setClickable(true);
                }
                imageView.setClickable(false);
                imageView.setSelected(true);
                dunVar.m();
                break;
            case 1:
                PlainMessage.Image image = (PlainMessage.Image) obj;
                GalleryRoundImageView galleryRoundImageView = ((dss) obj2).O;
                t15 t15Var = (t15) ((css) obj3);
                b bVar = t15Var.a;
                if (bVar.o0()) {
                    bVar.m0(null, null);
                    break;
                } else if (bVar.k0) {
                    lhv lhvVar = ImageViewerInfo.Companion;
                    LocalMessageRef localMessageRef = bVar.g0;
                    Integer valueOf = Integer.valueOf(i3);
                    Integer valueOf2 = Integer.valueOf(i2);
                    lhvVar.getClass();
                    ImageViewerInfo a = lhv.a(localMessageRef, image, valueOf, valueOf2);
                    PlainMessage.Item[] itemArr = t15Var.b.items;
                    ArrayList arrayList = new ArrayList();
                    for (PlainMessage.Item item : itemArr) {
                        lhv lhvVar2 = ImageViewerInfo.Companion;
                        LocalMessageRef localMessageRef2 = bVar.g0;
                        PlainMessage.Image image2 = item.image;
                        lhvVar2.getClass();
                        arrayList.add(lhv.a(localMessageRef2, image2, null, null));
                    }
                    String str = bVar.c0;
                    if (str != null && (h0 = bVar.h0()) != null && (jcz0Var = bVar.e0().f) != null) {
                        jcz0Var.q(galleryRoundImageView, str, a, arrayList, h0);
                        break;
                    }
                }
                break;
            default:
                MessageSelectionActionModeCallback.setupDialogViews$lambda$8((EditText) obj3, (MessageSelectionActionModeCallback) obj2, this.b, this.c, (AlertDialog) obj, view);
                break;
        }
    }

    public /* synthetic */ cun(css cssVar, dss dssVar, PlainMessage.Image image, int i, int i2) {
        this.w = cssVar;
        this.x = dssVar;
        this.y = image;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ cun(EditText editText, MessageSelectionActionModeCallback messageSelectionActionModeCallback, int i, int i2, AlertDialog alertDialog) {
        this.w = editText;
        this.x = messageSelectionActionModeCallback;
        this.b = i;
        this.c = i2;
        this.y = alertDialog;
    }
}
