package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ImageSizeKey;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a2q;

/* compiled from: ExchangeUserAdapter.kt */
/* loaded from: classes15.dex */
public final class m2q extends RecyclerView.Adapter<RecyclerView.e0> {
    public final a2q.b c;
    public final int d;
    public final ArrayList e = new ArrayList();

    /* compiled from: ExchangeUserAdapter.kt */
    public interface a {
        void a();

        void b(UserItem userItem);

        void c(UserItem userItem);
    }

    /* compiled from: ExchangeUserAdapter.kt */
    public static abstract class b {

        /* compiled from: ExchangeUserAdapter.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: ExchangeUserAdapter.kt */
        /* renamed from: xsna.m2q$b$b, reason: collision with other inner class name */
        public static final class C3319b extends b {
            public final UserItem a;

            public C3319b(UserItem userItem) {
                this.a = userItem;
            }
        }
    }

    public m2q(a2q.b bVar, int i) {
        this.c = bVar;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        b bVar = (b) this.e.get(i);
        if (bVar instanceof b.C3319b) {
            return 1;
        }
        if (bVar instanceof b.a) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String str;
        if (!(e0Var instanceof o2q)) {
            if (e0Var instanceof v1q) {
                v1q v1qVar = (v1q) e0Var;
                v1qVar.itemView.setOnClickListener(new be6(v1qVar, 6));
                return;
            }
            return;
        }
        o2q o2qVar = (o2q) e0Var;
        UserItem userItem = ((b.C3319b) this.e.get(i)).a;
        com.vk.core.ui.image.a<View> aVar = o2qVar.r;
        TextView textView = o2qVar.p;
        String str2 = userItem.g;
        String str3 = userItem.f;
        TextView textView2 = o2qVar.o;
        String str4 = userItem.d;
        String str5 = userItem.e;
        textView2.setText((str5 == null || drm0.N(str5)) ? str4 : v1v.a(' ', str4, str5));
        boolean z = str3 != null && str3.length() > 0;
        awt0.v(textView, z || (str2 != null && str2.length() > 0));
        String str6 = z ? str3 : str2;
        textView.setText(str6 != null ? str6.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 8226) : null);
        o2qVar.n.a(aVar.getView());
        View view = o2qVar.itemView;
        StringBuilder sb = new StringBuilder();
        ViewGroup viewGroup = o2qVar.l;
        Context context = viewGroup.getContext();
        String str7 = "";
        if (str5 == null) {
            str5 = "";
        }
        sb.append(context.getString(R.string.vk_exchange_user_switcher_active_account_talkback, str4, str5));
        if (str3 != null && str3.length() != 0) {
            str7 = viewGroup.getContext().getString(R.string.vk_exchange_user_phone_end_of_number_talkback, erm0.E0(2, str3));
        } else if (str2 != null && str2.length() != 0) {
            Context context2 = viewGroup.getContext();
            int length = str2.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = str2;
                    break;
                } else {
                    if (str2.charAt(i2) == 183) {
                        str = str2.substring(0, i2);
                        break;
                    }
                    i2++;
                }
            }
            int H = drm0.H(str2);
            while (true) {
                if (-1 < H) {
                    if (str2.charAt(H) == 183) {
                        str2 = str2.substring(H + 1);
                        break;
                    }
                    H--;
                } else {
                    break;
                }
            }
            str7 = context2.getString(R.string.vk_exchange_user_switcher_email_talkback, str, str2);
        }
        sb.append(str7);
        sb.append(viewGroup.getContext().getString(R.string.vk_exchange_user_switcher_go_to_account_talkback));
        view.setContentDescription(sb.toString());
        o2qVar.itemView.setOnClickListener(new n2q(0, o2qVar, userItem));
        o2qVar.q.setOnClickListener(new k1f(1, o2qVar, userItem));
        aVar.h(userItem.b.b, userItem.h, o2qVar.s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        a2q.b bVar = this.c;
        if (i == 1) {
            return new o2q(viewGroup, bVar);
        }
        if (i == 2) {
            return new v1q(viewGroup, bVar);
        }
        throw new IllegalStateException("Unsupported cell type");
    }
}
