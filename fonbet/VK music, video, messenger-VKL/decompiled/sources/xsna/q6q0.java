package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;
import xsna.dw20;

/* compiled from: UnsubscribeBottomSheetHelper.kt */
/* loaded from: classes17.dex */
public final class q6q0 {
    public final izs<izs<? super SdkClipVideoFile, s3q0>, s3q0> a;
    public final Context b;

    /* compiled from: UnsubscribeBottomSheetHelper.kt */
    public static final class a extends s770 {
        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            ((TextView) hkpVar.f(R.id.action_text)).setText((String) obj);
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            hkpVar.d(view.findViewById(R.id.action_text));
            return hkpVar;
        }
    }

    /* compiled from: UnsubscribeBottomSheetHelper.kt */
    public static final class b implements av20.b<String> {
        public final /* synthetic */ izs<SdkClipVideoFile, s3q0> b;
        public final /* synthetic */ Ref$ObjectRef<dw20> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super SdkClipVideoFile, s3q0> izsVar, Ref$ObjectRef<dw20> ref$ObjectRef) {
            this.b = izsVar;
            this.c = ref$ObjectRef;
        }

        @Override // xsna.av20.b
        public final void a(View view, Object obj, int i, wmg wmgVar) {
            q6q0.this.a.invoke(this.b);
            dw20 dw20Var = this.c.element;
            (dw20Var == null ? null : dw20Var).dismiss();
        }
    }

    public q6q0(Context context, izs izsVar) {
        this.a = izsVar;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, xsna.dw20] */
    public final void a(izs<? super SdkClipVideoFile, s3q0> izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        av20.a aVar = new av20.a();
        Context context = this.b;
        aVar.d(R.layout.unsubscribe_action_popup_item, LayoutInflater.from(context));
        aVar.d = new a();
        aVar.f = Collections.singletonList(context.getString(R.string.action_sheet_title_type_unsubscribe));
        aVar.e = new b(izsVar, ref$ObjectRef);
        ref$ObjectRef.element = dw20.a.k(new dw20.b(context, null), aVar.b(), 6).I0(null);
    }
}
