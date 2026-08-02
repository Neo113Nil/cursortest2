package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityCollectionCardView.kt */
/* loaded from: classes17.dex */
public final class gxg extends FrameLayout {
    public c b;
    public b c;
    public a d;
    public final TextView e;
    public final TextView f;
    public final VkImage g;

    /* compiled from: CommunityCollectionCardView.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CardImage(imageUrl="), this.a, ')');
        }
    }

    /* compiled from: CommunityCollectionCardView.kt */
    public static final class b {
        public final tlo0.h a;

        public b(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Subtitle(text="), this.a, ')');
        }
    }

    /* compiled from: CommunityCollectionCardView.kt */
    public static final class c {
        public final tlo0.h a;

        public c(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Title(text="), this.a, ')');
        }
    }

    public gxg(Context context) {
        super(context, null);
        View.inflate(context, R.layout.pds_community_collection_card, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.e = (TextView) findViewById(R.id.community_collection_card_title);
        this.f = (TextView) findViewById(R.id.community_collection_card_subtitle);
        this.g = (VkImage) findViewById(R.id.community_collection_card_cover);
    }

    public final a getCardImage() {
        return this.d;
    }

    public final b getSubtitle() {
        return this.c;
    }

    public final c getTitle() {
        return this.b;
    }

    public final void setCardImage(a aVar) {
        this.d = aVar;
        VkImage vkImage = this.g;
        vkImage.setClipToOutline(true);
        vkImage.setOutlineProvider(new s0w0(iah0.b(16.0f), 6));
        if (aVar != null) {
            vkImage.o0(aVar.a, null);
        }
    }

    public final void setSubtitle(b bVar) {
        this.c = bVar;
        boolean z = bVar != null;
        TextView textView = this.f;
        bwt0.p0(textView, z);
        textView.setText(bVar != null ? tlo0.b.a(bVar.a, getContext()) : null);
    }

    public final void setTitle(c cVar) {
        this.b = cVar;
        boolean z = cVar != null;
        TextView textView = this.e;
        bwt0.p0(textView, z);
        textView.setText(cVar != null ? tlo0.b.a(cVar.a, getContext()) : null);
    }
}
