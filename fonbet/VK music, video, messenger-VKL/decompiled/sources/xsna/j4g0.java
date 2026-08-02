package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.d4g0;

/* compiled from: ReplyItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class j4g0 extends vfz<i4g0> {
    public final eig0<d4g0> l;
    public final VKCircleImageView m;
    public final TextView n;
    public final ExpandableTextViewGroup o;
    public final TextView p;
    public final TextView q;
    public final c2g0 r;
    public i4g0 s;

    public /* synthetic */ j4g0(eig0 eig0Var, ViewGroup viewGroup, bbb0 bbb0Var, fa60 fa60Var, int i) {
        this(eig0Var, viewGroup, (i & 4) != 0 ? null : bbb0Var, (i & 8) != 0 ? null : fa60Var, true, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(i4g0 i4g0Var) {
        int i;
        i4g0 i4g0Var2 = i4g0Var;
        e0n.b(this.itemView, i4g0Var2.n);
        this.s = i4g0Var2;
        PostInteract postInteract = null;
        this.m.o0(i4g0Var2.e, null);
        this.n.setText(i4g0Var2.f);
        CharSequence charSequence = i4g0Var2.h;
        boolean z = !drm0.N(charSequence);
        ExpandableTextViewGroup expandableTextViewGroup = this.o;
        bwt0.p0(expandableTextViewGroup, z);
        expandableTextViewGroup.setText(charSequence);
        this.p.setText(i4g0Var2.j);
        bwt0.p0(this.q, i4g0Var2.g);
        if (i4g0Var2.i) {
            expandableTextViewGroup.b();
        } else {
            expandableTextViewGroup.a();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            expandableTextViewGroup.requestLayout();
        }
        List<Attachment> list = i4g0Var2.l;
        UserId userId = i4g0Var2.d;
        c2g0 c2g0Var = this.r;
        s980 s980Var = c2g0Var.d;
        zsj0 zsj0Var = c2g0Var.f;
        ArrayList<RecyclerView.e0> arrayList = c2g0Var.g;
        LinearLayout linearLayout = c2g0Var.c;
        List<Attachment> list2 = list;
        bwt0.p0(linearLayout, !(list2 == null || list2.isEmpty()));
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        linearLayout.removeAllViews();
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            RecyclerView.e0 e0Var = arrayList.get(size);
            if (e0Var instanceof qi6) {
                qi6 qi6Var = (qi6) e0Var;
                qi6Var.O6(null);
                qi6Var.M6(t980.a);
            }
            zsj0Var.b(e0Var);
        }
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            Attachment attachment = (Attachment) obj;
            if ((attachment instanceof eso0) || ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib())) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List<? extends Attachment> list3 = (List) pair.d();
        List<T> list4 = (List) pair.g();
        if (!list3.isEmpty()) {
            for (Attachment attachment2 : list3) {
                if (attachment2 instanceof VideoAttachment) {
                    ((VideoAttachment) attachment2).Lb("review reply", null, null);
                }
            }
            RecyclerView.e0 a = zsj0Var.a(5);
            if (a == null) {
                a = c2g0Var.a(linearLayout, 5);
            }
            if (a instanceof qi6) {
                qi6 qi6Var2 = (qi6) a;
                qi6Var2.O6(s980Var);
                if (s980Var != null) {
                    qi6Var2.M6(s980Var);
                }
            }
            if (a instanceof gfu) {
                arrayList.add(a);
                gfu gfuVar = (gfu) a;
                linearLayout.addView(gfuVar.itemView);
                f1s f1sVar = new f1s(25);
                gfuVar.F = list3;
                gfuVar.K = f1sVar;
                gfuVar.R6();
                gfuVar.itemView.setPadding(0, 0, 0, 0);
            }
        }
        if (list4.isEmpty()) {
            return;
        }
        ArrayList<MusicTrack> arrayList4 = new ArrayList<>();
        for (T t : list4) {
            boolean z2 = t instanceof AudioAttachment;
            if (z2) {
                AudioAttachment audioAttachment = (AudioAttachment) t;
                audioAttachment.h = "review reply";
                audioAttachment.i = postInteract;
                arrayList4.size();
                arrayList4.add(audioAttachment.f);
                audioAttachment.g = arrayList4;
            }
            if (t instanceof PhotoAttachment) {
                PhotoAttachment photoAttachment = (PhotoAttachment) t;
                i = photoAttachment.l.Hb() ? 110 : photoAttachment.l.Ib() ? 109 : 50;
            } else if (t instanceof VideoAttachment) {
                i = 51;
            } else if (t instanceof StickerAttachment) {
                i = ((StickerAttachment) t).V0() ? 67 : 66;
            } else if (t instanceof DocumentAttachment) {
                DocumentAttachment documentAttachment = (DocumentAttachment) t;
                if (documentAttachment.x5() && documentAttachment.V0()) {
                    i = 7;
                } else {
                    Image image = documentAttachment.s;
                    i = (image == null || image.b.isEmpty()) ? 39 : 11;
                }
            } else {
                i = z2 ? 6 : -1;
            }
            RecyclerView.e0 a2 = zsj0Var.a(i);
            if (a2 == null) {
                a2 = c2g0Var.a(linearLayout, i);
            }
            if (a2 instanceof qi6) {
                qi6 qi6Var3 = (qi6) a2;
                qi6Var3.O6(s980Var);
                if (s980Var != null) {
                    qi6Var3.M6(s980Var);
                }
            }
            if (a2 instanceof m56) {
                arrayList.add(a2);
                m56 m56Var = (m56) a2;
                linearLayout.addView(m56Var.itemView);
                m56Var.O6(s980Var);
                if ((m56Var instanceof do6) && (t instanceof StickerAttachment)) {
                    do6 do6Var = (do6) m56Var;
                    StickerAttachment stickerAttachment = (StickerAttachment) t;
                    gzs<tdg> gzsVar = c2g0Var.b;
                    do6Var.D = gzsVar != null ? gzsVar.invoke() : null;
                    do6Var.E = userId;
                    do6Var.R6(stickerAttachment);
                } else {
                    if (t == 0) {
                        t = 0;
                    }
                    m56Var.C = t;
                    if (t != 0) {
                        m56Var.T6(t);
                    }
                }
                if (m56Var instanceof ikg) {
                    m56Var.itemView.setPadding(0, 0, 0, cn70.b(4));
                } else {
                    m56Var.itemView.setPadding(0, 0, 0, 0);
                }
            }
            postInteract = null;
        }
    }

    public final void h6() {
        i4g0 i4g0Var;
        UserId userId;
        UserId userId2;
        i4g0 i4g0Var2 = this.s;
        if ((i4g0Var2 != null && (userId2 = i4g0Var2.d) != null && !fkq0.c(userId2)) || (i4g0Var = this.s) == null || (userId = i4g0Var.d) == null) {
            return;
        }
        this.l.a(new d4g0.e(userId));
    }

    public j4g0(eig0<d4g0> eig0Var, ViewGroup viewGroup, gzs<? extends tdg> gzsVar, s980 s980Var, boolean z, int i) {
        super(e0n.a(R.layout.reply_item_view_holder, viewGroup, z));
        this.l = eig0Var;
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.author_photo);
        this.m = vKCircleImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.author_name);
        this.n = textView;
        ExpandableTextViewGroup expandableTextViewGroup = (ExpandableTextViewGroup) this.itemView.findViewById(R.id.text);
        this.o = expandableTextViewGroup;
        this.p = (TextView) this.itemView.findViewById(R.id.date_tv);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.reply_btn);
        this.q = textView2;
        this.r = new c2g0(gzsVar, (LinearLayout) this.itemView.findViewById(R.id.attach_container), s980Var);
        o8c0 o8c0Var = new o8c0(this, 2);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        expandableTextViewGroup.setMaxLines(3);
        expandableTextViewGroup.setExpandText(this.itemView.getContext().getString(R.string.reply_item_expand_text));
        expandableTextViewGroup.setOnExpandClickListener(o8c0Var);
        bwt0.i0(this.itemView, new bk30(this, 27));
        bwt0.i0(textView2, new qz40(this, 19));
        bwt0.i0(vKCircleImageView, new z6f0(this, 2));
        bwt0.i0(textView, new fv90(this, 19));
    }
}
