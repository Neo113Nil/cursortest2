package com.yandex.messaging.ui.reactions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.domain.user.UserNameType;
import defpackage.arg;
import defpackage.b890;
import defpackage.d890;
import defpackage.e3n;
import defpackage.e3r;
import defpackage.fx00;
import defpackage.g9v;
import defpackage.h791;
import defpackage.in21;
import defpackage.jyf0;
import defpackage.kp50;
import defpackage.kyf0;
import defpackage.lyf0;
import defpackage.myf0;
import defpackage.nyf0;
import defpackage.o430;
import defpackage.olh0;
import defpackage.pzt0;
import defpackage.qp21;
import defpackage.rp21;
import defpackage.tje;
import defpackage.ugd0;
import defpackage.unr0;
import defpackage.vse;
import defpackage.w511;
import defpackage.xav;
import defpackage.xn50;
import defpackage.yn50;
import java.util.Calendar;
import java.util.Date;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c extends d890 {
    public final arg A;
    public final MessengerEnvironment B;
    public final e3r C;
    public final rp21 D;
    public ugd0 E;
    public final com.yandex.messaging.internal.avatar.a x;
    public final vse y;
    public final xav z;

    public c(b890 b890Var, com.yandex.messaging.internal.avatar.a aVar, vse vseVar, xav xavVar, arg argVar, MessengerEnvironment messengerEnvironment, e3r e3rVar, rp21 rp21Var) {
        super(b890Var, new nyf0());
        this.x = aVar;
        this.y = vseVar;
        this.z = xavVar;
        this.A = argVar;
        this.B = messengerEnvironment;
        this.C = e3rVar;
        this.D = rp21Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        String r;
        b bVar = (b) x0Var;
        lyf0 lyf0Var = (lyf0) getItem(i);
        ImageView imageView = bVar.W;
        ReducedUserInfo b = lyf0Var.b();
        View view = bVar.a;
        view.setOnClickListener(new fx00(28, bVar, lyf0Var));
        rp21 rp21Var = bVar.S;
        String str = b.userId;
        long c = rp21Var.b.c();
        in21 a = rp21Var.a.a().a(str);
        bVar.V.setText(h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), view.getResources(), b.displayName));
        TextView textView = bVar.Z;
        arg argVar = bVar.Q;
        o430 o430Var = e3n.b;
        Date date = new Date(e3n.e(kp50.V(lyf0Var.a(), DurationUnit.MICROSECONDS)));
        argVar.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String format = argVar.a.format(date);
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            r = unr0.r(new StringBuilder(), argVar.h, Extension.FIX_SPACE, format);
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(5, -1);
            r = (calendar.get(1) == calendar3.get(1) && calendar.get(6) == calendar3.get(6)) ? unr0.r(new StringBuilder(), argVar.i, Extension.FIX_SPACE, format) : argVar.g.format(date);
        }
        textView.setText(r);
        pzt0 pzt0Var = bVar.c0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.c0 = tje.N(bVar.O, null, null, new PublicReactionViewHolder$bind$2(bVar, b, null), 3);
        if (!(lyf0Var instanceof jyf0)) {
            if (lyf0Var instanceof kyf0) {
                imageView.setVisibility(8);
                return;
            } else {
                w511.b();
                return;
            }
        }
        imageView.setVisibility(0);
        int i2 = ((jyf0) lyf0Var).a;
        String str2 = bVar.P + i2;
        g9v load = bVar.R.load(str2);
        int i3 = bVar.b0;
        yn50 yn50Var = (yn50) load;
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = i3;
        xn50Var.j = i3;
        yn50Var.b(imageView, new myf0(str2, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_public_reacted, viewGroup, false), this.x, this.y.c(false), (String) this.B.c(this.C), this.A, this.z, this.D, this.E);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        b bVar = (b) x0Var;
        super.onViewRecycled(bVar);
        pzt0 pzt0Var = bVar.c0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.c0 = null;
    }
}
