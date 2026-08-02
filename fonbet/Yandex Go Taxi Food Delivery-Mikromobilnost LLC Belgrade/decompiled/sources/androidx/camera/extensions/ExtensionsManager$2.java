package androidx.camera.extensions;

import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
class ExtensionsManager$2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
    final /* synthetic */ a this$0;
    final /* synthetic */ b val$completer;

    public ExtensionsManager$2(a aVar, b bVar) {
        this.this$0 = aVar;
        this.val$completer = bVar;
    }

    public void onFailure(int i) {
        this.val$completer.d(new Exception("Failed to deinitialize extensions."));
    }

    public void onSuccess() {
        this.val$completer.b(null);
    }
}
