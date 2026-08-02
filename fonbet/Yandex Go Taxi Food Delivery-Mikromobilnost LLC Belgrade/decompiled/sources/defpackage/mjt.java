package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes15.dex */
public final class mjt {
    public final k020 a;
    public final to3 b;
    public final h9b c;
    public final ml21 d;
    public final ogu e;
    public final lqo f;
    public final ks10 g;
    public final doc h;
    public final Resources i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public mjt(Context context, k020 k020Var, to3 to3Var, h9b h9bVar, ml21 ml21Var, ogu oguVar, lqo lqoVar, ks10 ks10Var, doc docVar) {
        this.a = k020Var;
        this.b = to3Var;
        this.c = h9bVar;
        this.d = ml21Var;
        this.e = oguVar;
        this.f = lqoVar;
        this.g = ks10Var;
        this.h = docVar;
        Resources resources = context.getResources();
        this.i = resources;
        this.j = resources.getString(oyh0.messenger_message_with_file);
        this.k = resources.getString(oyh0.messenger_message_with_div_card);
        this.l = resources.getString(oyh0.messenger_message_with_image);
        this.m = resources.getString(oyh0.messenger_message_with_sticker);
        this.n = resources.getString(oyh0.messenger_message_with_gallery);
        this.o = resources.getString(oyh0.messenger_forwarder_messages_text);
    }
}
