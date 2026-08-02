package xsna;

import android.content.Context;
import androidx.credentials.CredentialManager;
import androidx.room.RoomDatabase;
import com.vk.toggle.internal.storage.database.FeatureDatabase;
import xsna.xuq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ya3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ya3(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Context context = this.c;
                xuq.a aVar = xuq.a.a;
                db3 db3Var = new db3(0);
                FeatureDatabase featureDatabase = xuq.a.b;
                if (featureDatabase == null) {
                    synchronized (aVar) {
                        featureDatabase = xuq.a.b;
                        if (featureDatabase == null) {
                            featureDatabase = null;
                        }
                        if (featureDatabase == null) {
                            RoomDatabase.a a = bhv0.a(context, "features_storage", FeatureDatabase.class);
                            a.a(buq.a);
                            a.i = true;
                            RoomDatabase b = a.b();
                            xuq.a.b = (FeatureDatabase) b;
                            featureDatabase = (FeatureDatabase) b;
                        }
                    }
                }
                return new j0p0(featureDatabase, db3Var);
            default:
                return CredentialManager.Companion.create(this.c);
        }
    }
}
