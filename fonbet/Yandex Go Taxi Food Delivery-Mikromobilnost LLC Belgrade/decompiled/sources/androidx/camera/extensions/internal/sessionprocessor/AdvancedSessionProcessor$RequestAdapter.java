package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import defpackage.j8j0;
import defpackage.q7j0;
import defpackage.szd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
class AdvancedSessionProcessor$RequestAdapter implements j8j0 {
    private final RequestProcessorImpl.Request mImplRequest;
    private final szd mParameters;
    private final List<Integer> mTargetOutputConfigIds;
    private final int mTemplateId;

    public AdvancedSessionProcessor$RequestAdapter(RequestProcessorImpl.Request request) {
        this.mImplRequest = request;
        ArrayList arrayList = new ArrayList();
        Iterator it = request.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            arrayList.add((Integer) it.next());
        }
        this.mTargetOutputConfigIds = arrayList;
        q7j0 q7j0Var = new q7j0();
        for (CaptureRequest.Key key : request.getParameters().keySet()) {
            q7j0Var.b(key, request.getParameters().get(key));
        }
        this.mParameters = q7j0Var.a();
        this.mTemplateId = request.getTemplateId().intValue();
    }

    public RequestProcessorImpl.Request getImplRequest() {
        return this.mImplRequest;
    }

    @Override // defpackage.j8j0
    public szd getParameters() {
        return this.mParameters;
    }

    @Override // defpackage.j8j0
    public List<Integer> getTargetOutputConfigIds() {
        return this.mTargetOutputConfigIds;
    }

    @Override // defpackage.j8j0
    public int getTemplateId() {
        return this.mTemplateId;
    }
}
