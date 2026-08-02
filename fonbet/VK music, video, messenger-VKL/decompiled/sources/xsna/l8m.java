package xsna;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l8m implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1 != null) goto L38;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object failure;
        switch (this.b) {
            case 0:
                j9i j9iVar = (j9i) this.c;
                j9i j9iVar2 = (j9i) obj;
                j9iVar2.b.add(j9iVar);
                j9iVar.a.add(j9iVar2);
                return s3q0.a;
            case 1:
                vop vopVar = (vop) this.c;
                par0.a.getClass();
                par0.d((Throwable) obj);
                boolean z = ((Boolean) vopVar.D.getValue()).booleanValue() || ((Boolean) vopVar.E.getValue()).booleanValue();
                if (!vopVar.C && z) {
                    qcv0 qcv0Var = vopVar.y;
                    if (qcv0Var != null) {
                        new uop(1, vopVar, vop.class, "onPhoneSelected", "onPhoneSelected(Ljava/lang/String;)V", 0);
                        qcv0Var.b(16845);
                    } else {
                        com.vk.registration.funnels.b.a.getClass();
                        com.vk.registration.funnels.b.m();
                    }
                    vopVar.C = true;
                }
                cop copVar = (cop) vopVar.a;
                if (copVar != null) {
                    copVar.X2();
                }
                return s3q0.a;
            case 2:
                ((p870) ((ek40) this.c).b.getValue()).e(120, new AudioAttachment(((yd50) obj).a));
                return s3q0.a;
            case 3:
                vx2.d.p((rsg0) this.c);
                return s3q0.a;
            default:
                Context context = (Context) this.c;
                String str = (String) obj;
                e2r0.b.getClass();
                try {
                    Uri withAppendedPath = Uri.withAppendedPath(new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str.concat(".UsersContentProvider")).appendQueryParameter("version", "2").build(), "users");
                    ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(withAppendedPath);
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(withAppendedPath, null, null, null, "timestamp DESC");
                            if (query != null) {
                                try {
                                    ListBuilder e = e43.e();
                                    while (query.moveToNext()) {
                                        e.add(f2r0.a(query));
                                    }
                                    failure = e.g();
                                    query.close();
                                } finally {
                                }
                            } else {
                                failure = null;
                            }
                            yfb.d(acquireUnstableContentProviderClient, null);
                            break;
                        } finally {
                        }
                    }
                    failure = EmptyList.b;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    Log.e("UsersStoreContentResolver", "An error occurred on loadUsers", a);
                }
                EmptyList emptyList = EmptyList.b;
                if (failure instanceof Result.Failure) {
                    failure = emptyList;
                }
                return (List) failure;
        }
    }
}
