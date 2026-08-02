package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vkontakte.android.R;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dkq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ dkq(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Context context = this.c;
                try {
                    return new cq2(context, (AnimationDrawable) m33.a(R.drawable.flower_loader, context));
                } catch (Resources.NotFoundException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return null;
                } catch (ClassCastException e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                    return null;
                } catch (IndexOutOfBoundsException e3) {
                    com.vk.metrics.eventtracking.b.a.a(e3);
                    return null;
                } catch (NullPointerException e4) {
                    com.vk.metrics.eventtracking.b.a.a(e4);
                    return null;
                } catch (OutOfMemoryError e5) {
                    com.vk.metrics.eventtracking.b.a.a(e5);
                    return null;
                } catch (XmlPullParserException e6) {
                    com.vk.metrics.eventtracking.b.a.a(e6);
                    return null;
                }
            default:
                return ((AccountManagerComponent) m7m.e().a(fpf0.a(AccountManagerComponent.class))).b();
        }
    }
}
