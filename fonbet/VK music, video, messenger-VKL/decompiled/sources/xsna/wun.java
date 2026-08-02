package xsna;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: DocumentsListAdapter.kt */
/* loaded from: classes18.dex */
public final class wun extends awu<Document> {
    public final DocumentsListFragment i;
    public final DocumentsListFragment j;
    public final h2u<Document> k = new h2u<>();
    public int l;

    /* compiled from: DocumentsListAdapter.kt */
    public static class a extends vif0<Document> implements View.OnClickListener, View.OnLongClickListener {
        public final ytn n;
        public final gun o;
        public final TextView p;
        public final TextView q;
        public final TextView r;
        public final VKImageView s;

        public a(ViewGroup viewGroup, DocumentsListFragment documentsListFragment, DocumentsListFragment documentsListFragment2) {
            super(viewGroup, R.layout.holder_document, 0);
            this.n = documentsListFragment;
            this.o = documentsListFragment2;
            this.p = (TextView) this.itemView.findViewById(R.id.holder_document_type_text);
            this.q = (TextView) this.itemView.findViewById(R.id.holder_document_title_text);
            this.r = (TextView) this.itemView.findViewById(R.id.holder_document_info_text);
            this.s = (VKImageView) this.itemView.findViewById(R.id.holder_document_preview_image);
            this.itemView.setOnClickListener(this);
            this.itemView.setOnLongClickListener(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onClick(View view) {
            gun gunVar = this.o;
            if (gunVar != null) {
                gunVar.u3((Document) this.m, getAdapterPosition());
            }
            ytn ytnVar = this.n;
            if (ytnVar != null) {
                ytnVar.lh((Document) this.m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean onLongClick(View view) {
            ytn ytnVar = this.n;
            if (ytnVar != null) {
                return ytnVar.Sh((Document) this.m);
            }
            return false;
        }

        @Override // xsna.vif0
        @SuppressLint({"SetTextI18n"})
        /* renamed from: q6 */
        public void i6(Document document) {
            if (document == null) {
                return;
            }
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(document.l);
            }
            TextView textView2 = this.r;
            if (textView2 != null) {
                textView2.setText(dun.s6(document.g, b6()) + " · " + pvo0.i(false, document.c, false, false));
            }
            TextView textView3 = this.p;
            if (textView3 != null) {
                String str = document.m;
                textView3.setText(str.substring(0, Math.min(str.length(), 4)));
            }
            VKImageView vKImageView = this.s;
            if (vKImageView != null) {
                String str2 = document.n;
                bwt0.p0(vKImageView, !(str2 == null || str2.length() == 0));
            }
            if (vKImageView != null) {
                vKImageView.load(document.n);
            }
        }
    }

    public wun(DocumentsListFragment documentsListFragment, DocumentsListFragment documentsListFragment2) {
        this.i = documentsListFragment;
        this.j = documentsListFragment2;
    }

    @Override // xsna.awu
    public final long L0(int i) {
        long j = ((Document) j5g.b0(i, y0())) != null ? r0.b : 0L;
        return i < this.l ? -j : j;
    }

    @Override // xsna.awu
    public final int N0(int i) {
        return 0;
    }

    @Override // xsna.awu
    public final void O0(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof a) {
            ((a) e0Var).V5(((ArrayList) y0()).get(i));
        }
    }

    @Override // xsna.awu
    public final RecyclerView.e0 P0(int i, ViewGroup viewGroup) {
        return new a(viewGroup, this.i, this.j);
    }
}
