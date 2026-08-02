package xsna;

import androidx.credentials.CredentialOption;
import androidx.credentials.provider.PendingIntentHandler;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pi7 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ pi7(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CredentialOption retrieveProviderGetCredentialRequest$lambda$1;
        int i = this.a;
        izs izsVar = this.b;
        switch (i) {
            case 0:
                Pattern pattern = BoardTopicViewFragment.H0;
                return (String) ((x50) izsVar).invoke(obj);
            default:
                retrieveProviderGetCredentialRequest$lambda$1 = PendingIntentHandler.Api34Impl.Companion.retrieveProviderGetCredentialRequest$lambda$1(izsVar, obj);
                return retrieveProviderGetCredentialRequest$lambda$1;
        }
    }
}
