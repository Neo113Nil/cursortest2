package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.tzu0;

/* compiled from: IdentityAdapter.kt */
/* loaded from: classes6.dex */
public final class tuv extends RecyclerView.Adapter<RecyclerView.e0> {
    public final WebIdentityContext c;
    public final String d;
    public final int e;
    public final tzu0.e f;
    public final ArrayList g;

    /* compiled from: IdentityAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public a(View view) {
            super(view);
            jjc.g(view, new srg(tuv.this, 22));
        }
    }

    /* compiled from: IdentityAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;
        public final ImageView n;

        public b(View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.title);
            this.m = (TextView) view.findViewById(R.id.subtitle);
            ImageView imageView = (ImageView) view.findViewById(R.id.check);
            this.n = imageView;
            Context context = this.itemView.getContext();
            Drawable a = m33.a(R.drawable.vk_icon_done_24, context);
            sjo.b(a, context.getColor(R.color.vk_header_blue), PorterDuff.Mode.SRC_IN);
            imageView.setImageDrawable(a);
            jjc.g(view, new kp5(13, tuv.this, this));
        }
    }

    public tuv(WebIdentityContext webIdentityContext, String str, int i, tzu0.e eVar) {
        this.c = webIdentityContext;
        this.d = str;
        this.e = i;
        this.f = eVar;
        ArrayList arrayList = new ArrayList();
        WebIdentityCardData webIdentityCardData = webIdentityContext.c;
        Iterator<T> it = webIdentityCardData.Eb(str).iterator();
        while (it.hasNext()) {
            arrayList.add(new yuv((WebIdentityCard) it.next()));
        }
        if (!webIdentityCardData.Ib(str)) {
            arrayList.add(new vuv(R.layout.vk_material_list_button_blue));
        }
        this.g = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((vuv) this.g.get(i)).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String string;
        if (!(e0Var instanceof a)) {
            if (e0Var instanceof b) {
                b bVar = (b) e0Var;
                yuv yuvVar = (yuv) this.g.get(i);
                ImageView imageView = bVar.n;
                TextView textView = bVar.l;
                WebIdentityCard webIdentityCard = yuvVar.b;
                textView.setText(webIdentityCard.getTitle());
                bVar.m.setText(webIdentityCard.Cb());
                tuv tuvVar = tuv.this;
                if (tuvVar.e == webIdentityCard.zb()) {
                    imageView.setVisibility(0);
                    return;
                } else {
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        a aVar = (a) e0Var;
        View view = aVar.itemView;
        TextView textView2 = (TextView) view;
        Context context = view.getContext();
        String str = tuv.this.d;
        int hashCode = str.hashCode();
        if (hashCode == -1147692044) {
            if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                string = context.getString(R.string.vk_identity_add_address);
                textView2.setText(string);
                return;
            }
            throw new IllegalStateException(str.concat(" not supported"));
        }
        if (hashCode == 96619420) {
            if (str.equals("email")) {
                string = context.getString(R.string.vk_identity_add_email);
                textView2.setText(string);
                return;
            }
            throw new IllegalStateException(str.concat(" not supported"));
        }
        if (hashCode == 106642798 && str.equals("phone")) {
            string = context.getString(R.string.vk_identity_add_phone);
            textView2.setText(string);
            return;
        }
        throw new IllegalStateException(str.concat(" not supported"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.vk_material_list_button_blue) {
            return new a(tf3.b(viewGroup, i, viewGroup, false));
        }
        if (i == R.layout.vk_identity_item) {
            return new b(tf3.b(viewGroup, i, viewGroup, false));
        }
        throw new IllegalStateException("unsupported this viewType");
    }
}
