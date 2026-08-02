package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.photo.Photo;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ef3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelableAdapter d;

    public /* synthetic */ ef3(int i, Serializer.StreamParcelableAdapter streamParcelableAdapter, Object obj) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelableAdapter;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                Context context = ((op20) obj).b;
                Regex regex = com.vk.common.links.c.a;
                new GameUnavailableFragment.a((ApiApplication) streamParcelableAdapter).k(context);
                break;
            case 1:
                ((x0o0) obj).n.remove(Integer.valueOf(((Photo) streamParcelableAdapter).c));
                break;
            default:
                ((z8u0) obj).I.remove(Integer.valueOf(((Photo) streamParcelableAdapter).c));
                break;
        }
    }
}
