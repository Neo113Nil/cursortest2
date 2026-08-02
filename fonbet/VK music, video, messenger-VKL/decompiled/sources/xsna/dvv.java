package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.tzu0;

/* compiled from: IdentityContextAdapter.kt */
/* loaded from: classes6.dex */
public final class dvv extends RecyclerView.Adapter<RecyclerView.e0> {
    public final WebIdentityContext c;
    public final tzu0.d d;
    public final ArrayList e;

    /* compiled from: IdentityContextAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;

        public a(dvv dvvVar, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.title);
            this.l = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.add_item);
            this.m = textView2;
            textView2.setCompoundDrawablesWithIntrinsicBounds(krv0.f(R.drawable.vk_icon_cancel_16, R.attr.vk_ui_text_accent, textView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            jjc.g(view, new rh4(15, dvvVar, this));
        }
    }

    /* compiled from: IdentityContextAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public b(ivv ivvVar) {
            super(ivvVar);
        }
    }

    /* compiled from: IdentityContextAdapter.kt */
    public final class c extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;

        public c(dvv dvvVar, View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.title);
            TextView textView = (TextView) view.findViewById(R.id.selected_item);
            this.m = textView;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, krv0.f(R.drawable.vk_icon_dropdown_24, R.attr.vk_ui_icon_secondary, textView.getContext()), (Drawable) null);
            jjc.g(view, new k22(8, dvvVar, this));
        }
    }

    public dvv(WebIdentityContext webIdentityContext, tzu0.d dVar) {
        this.c = webIdentityContext;
        this.d = dVar;
        ky6 j = Preference.j();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new uuv(webIdentityContext.d));
        for (String str : webIdentityContext.b) {
            WebIdentityCard a2 = pgx0.a(j, webIdentityContext.c, str);
            arrayList.add(a2 == null ? new wuv(str) : new avv(a2));
        }
        this.e = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((vuv) this.e.get(i)).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String string;
        String title;
        String Cb;
        SpannableString spannableString;
        String string2;
        vuv vuvVar = (vuv) this.e.get(i);
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            ivv ivvVar = (ivv) bVar.itemView;
            dvv dvvVar = dvv.this;
            WebApiApplication webApiApplication = ((uuv) vuvVar).b;
            ivvVar.b.f(webApiApplication.d.a(150).b, new VKImageController.b(14.0f, null, false, R.drawable.vk_default_placeholder_12, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518));
            ivvVar.d.setText(ivvVar.getContext().getString(R.string.vk_apps_request_access_title, webApiApplication.c));
            if (dvvVar.c.isEmpty()) {
                ivvVar.setMessage(R.string.vk_identity_desc);
                return;
            } else {
                ivvVar.setMessage(R.string.vk_apps_request_data_card_subtitle);
                return;
            }
        }
        if (e0Var instanceof a) {
            a aVar = (a) e0Var;
            String str = ((wuv) vuvVar).b;
            TextView textView = aVar.l;
            textView.setText(pgx0.b(textView.getContext(), str));
            TextView textView2 = aVar.m;
            Context context = textView2.getContext();
            int hashCode = str.hashCode();
            if (hashCode == -1147692044) {
                if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string2 = context.getString(R.string.vk_identity_add_address);
                    textView2.setText(string2);
                    return;
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 96619420) {
                if (str.equals("email")) {
                    string2 = context.getString(R.string.vk_identity_add_email);
                    textView2.setText(string2);
                    return;
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 106642798 && str.equals("phone")) {
                string2 = context.getString(R.string.vk_identity_add_phone);
                textView2.setText(string2);
                return;
            }
            throw new IllegalStateException(str.concat(" not supported"));
        }
        if (e0Var instanceof c) {
            c cVar = (c) e0Var;
            WebIdentityCard webIdentityCard = ((avv) vuvVar).b;
            TextView textView3 = cVar.l;
            Context context2 = textView3.getContext();
            String type = webIdentityCard.getType();
            int hashCode2 = type.hashCode();
            if (hashCode2 == -1147692044) {
                if (type.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string = context2.getString(R.string.vk_identity_address);
                    textView3.setText(string);
                    TextView textView4 = cVar.m;
                    Context context3 = textView4.getContext();
                    title = webIdentityCard.getTitle();
                    Cb = webIdentityCard.Cb();
                    if (Cb != null) {
                    }
                    spannableString = new SpannableString(title);
                    textView4.setText(spannableString);
                    return;
                }
                throw new IllegalStateException(type.concat(" not supported"));
            }
            if (hashCode2 == 96619420) {
                if (type.equals("email")) {
                    string = context2.getString(R.string.vk_identity_email);
                    textView3.setText(string);
                    TextView textView42 = cVar.m;
                    Context context32 = textView42.getContext();
                    title = webIdentityCard.getTitle();
                    Cb = webIdentityCard.Cb();
                    if (Cb != null) {
                    }
                    spannableString = new SpannableString(title);
                    textView42.setText(spannableString);
                    return;
                }
                throw new IllegalStateException(type.concat(" not supported"));
            }
            if (hashCode2 == 106642798 && type.equals("phone")) {
                string = context2.getString(R.string.vk_identity_phone);
                textView3.setText(string);
                TextView textView422 = cVar.m;
                Context context322 = textView422.getContext();
                title = webIdentityCard.getTitle();
                Cb = webIdentityCard.Cb();
                if (Cb != null || Cb.length() == 0) {
                    spannableString = new SpannableString(title);
                } else {
                    spannableString = new SpannableString(pzl.b(title, " · ", Cb));
                    spannableString.setSpan(new ForegroundColorSpan(context322.getColor(R.color.vk_gray_400)), title.length(), spannableString.length(), 33);
                }
                textView422.setText(spannableString);
                return;
            }
            throw new IllegalStateException(type.concat(" not supported"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3) {
            ivv ivvVar = new ivv(viewGroup.getContext());
            ivvVar.setLayoutParams(new RecyclerView.p(-1, -2));
            return new b(ivvVar);
        }
        if (i == R.layout.vk_identity_card_item) {
            return new c(this, tf3.b(viewGroup, i, viewGroup, false));
        }
        if (i == R.layout.vk_add_identity_card_item) {
            return new a(this, tf3.b(viewGroup, i, viewGroup, false));
        }
        throw new IllegalStateException("unsupported this viewType");
    }
}
