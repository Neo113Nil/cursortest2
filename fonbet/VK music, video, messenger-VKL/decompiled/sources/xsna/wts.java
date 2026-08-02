package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;

/* compiled from: FriendsTagsConfirmationHolder.kt */
/* loaded from: classes4.dex */
public final class wts extends qi6<Photos> implements View.OnClickListener, z980 {
    public static final /* synthetic */ int G = 0;
    public Runnable C;
    public final m6n0 D;
    public final TextView E;
    public Photo F;

    /* compiled from: FriendsTagsConfirmationHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            List<PhotoTag> list;
            wts wtsVar = (wts) this.receiver;
            Photo photo = wtsVar.F;
            if (photo != null && (list = photo.b) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((PhotoTag) it.next()).l = true;
                }
            }
            wtsVar.R6();
            return s3q0.a;
        }
    }

    /* compiled from: FriendsTagsConfirmationHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            int intValue = num.intValue();
            wts wtsVar = (wts) this.receiver;
            if (intValue > 0) {
                wtsVar.E.setText(y8g0.c(R.plurals.photo_tags_multiple_friends_confirm, intValue));
            } else {
                int i = wts.G;
                wtsVar.getClass();
            }
            return s3q0.a;
        }
    }

    public wts(ViewGroup viewGroup, Runnable runnable) {
        super(R.layout.post_item_confirm_friends_tags, viewGroup);
        this.C = runnable;
        this.D = new m6n0(new a(0, this, wts.class, "onConfirmAll", "onConfirmAll()V", 0), new b(1, this, wts.class, "onDismiss", "onDismiss(I)V", 0), this);
        this.E = (TextView) this.itemView.findViewById(R.id.confirm_tags_title);
        TextView textView = (TextView) this.itemView.findViewById(R.id.confirm_tags_show_btn);
        bwt0.X(R.drawable.vk_icon_stars_circle_fill_violet_48, this.itemView.findViewById(R.id.confirm_tags_image));
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(Photos photos) {
        PhotoAttachment Mb = photos.Mb();
        this.F = Mb != null ? Mb.l : null;
    }

    @Override // xsna.z980
    public final void R5(Photo photo, PhotoTag photoTag) {
        photoTag.l = false;
    }

    public final void R6() {
        Photo photo = this.F;
        if (photo == null) {
            return;
        }
        List<PhotoTag> list = photo.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((PhotoTag) it.next()).l) {
                    return;
                }
            }
        }
        p870.f().e(113, photo);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dw20.a i;
        if (jjc.b()) {
            return;
        }
        Context context = this.itemView.getContext();
        Photo photo = this.F;
        List<PhotoTag> list = photo != null ? photo.b : null;
        m6n0 m6n0Var = this.D;
        m6n0Var.getClass();
        List<PhotoTag> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        m6n0Var.e = list;
        m6n0Var.f = photo;
        s3n0 s3n0Var = new s3n0();
        s3n0Var.setItems(list);
        s3n0Var.e = m6n0Var.h;
        s3n0Var.f = photo;
        i = new dw20.b(context, null).v0(R.string.photo_tags_suggestions_tagged_friends).c(new cpo(false, 0, 6)).i(s3n0Var, (r3 & 2) == 0, false);
        m6n0Var.d = ((dw20.b) ((dw20.b) i).o()).h0(R.string.photo_tags_suggestions_confirm_all, new l6n0(m6n0Var, 0)).a0(new w2j0(m6n0Var, 5)).I0(null);
    }

    @Override // xsna.z980
    public final void w4(Photo photo, PhotoTag photoTag) {
        photoTag.l = true;
        R6();
    }
}
