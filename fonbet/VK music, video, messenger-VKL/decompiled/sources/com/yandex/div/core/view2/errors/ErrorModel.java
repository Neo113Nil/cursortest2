package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.ErrorModel;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.go9;
import xsna.izs;
import xsna.j5g;
import xsna.mnh0;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes7.dex */
public final class ErrorModel {
    private DivDataTag dataTag;
    private final Div2View div2View;
    private final ErrorCollectors errorCollectors;
    private Disposable existingSubscription;
    private final boolean visualErrorsEnabled;
    private final Set<izs<ErrorViewModel, s3q0>> observers = new LinkedHashSet();
    private final List<Throwable> currentErrors = new ArrayList();
    private final List<Throwable> currentWarnings = new ArrayList();
    private final LogcatErrorDumper logcatErrorDumper = new LogcatErrorDumper();
    private final wzs<List<? extends Throwable>, List<? extends Throwable>, s3q0> updateOnErrors = new wzs<List<? extends Throwable>, List<? extends Throwable>, s3q0>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$updateOnErrors$1
        {
            super(2);
        }

        @Override // xsna.wzs
        public /* bridge */ /* synthetic */ s3q0 invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            invoke2(list, list2);
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Throwable> list, List<? extends Throwable> list2) {
            boolean z;
            List list3;
            List list4;
            ErrorViewModel errorViewModel;
            List list5;
            List list6;
            String errorsToDetails;
            List list7;
            List list8;
            String warningsToDetails;
            LogcatErrorDumper logcatErrorDumper;
            List<? extends Throwable> list9;
            List<? extends Throwable> list10;
            DivDataTag divDataTag;
            z = ErrorModel.this.visualErrorsEnabled;
            if (z) {
                list3 = ErrorModel.this.currentErrors;
                list3.clear();
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                list3.addAll(arrayList);
                list4 = ErrorModel.this.currentWarnings;
                list4.clear();
                ArrayList arrayList2 = new ArrayList(list2);
                Collections.reverse(arrayList2);
                list4.addAll(arrayList2);
                ErrorModel errorModel = ErrorModel.this;
                errorViewModel = errorModel.state;
                list5 = ErrorModel.this.currentErrors;
                int size = list5.size();
                ErrorModel errorModel2 = ErrorModel.this;
                list6 = errorModel2.currentErrors;
                errorsToDetails = errorModel2.errorsToDetails(list6);
                list7 = ErrorModel.this.currentWarnings;
                int size2 = list7.size();
                ErrorModel errorModel3 = ErrorModel.this;
                list8 = errorModel3.currentWarnings;
                warningsToDetails = errorModel3.warningsToDetails(list8);
                errorModel.setState(ErrorViewModel.copy$default(errorViewModel, false, size, size2, errorsToDetails, warningsToDetails, 1, null));
                logcatErrorDumper = ErrorModel.this.logcatErrorDumper;
                list9 = ErrorModel.this.currentErrors;
                list10 = ErrorModel.this.currentWarnings;
                divDataTag = ErrorModel.this.dataTag;
                logcatErrorDumper.logErrors(list9, list10, divDataTag);
            }
        }
    };
    private ErrorViewModel state = new ErrorViewModel(false, 0, 0, null, null, 31, null);

    public ErrorModel(ErrorCollectors errorCollectors, Div2View div2View, boolean z) {
        this.errorCollectors = errorCollectors;
        this.div2View = div2View;
        this.visualErrorsEnabled = z;
    }

    private final JSONObject dumpCardWithContextVariables() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templates", new JSONObject());
        j3 divData = this.div2View.getDivData();
        jSONObject.put("card", divData != null ? divData.writeToJSON() : null);
        jSONObject.put("variables", dumpGlobalVariables());
        return jSONObject;
    }

    private final JSONArray dumpGlobalVariables() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.div2View.getDiv2Component$div_release().getDivVariableController().captureAllVariables().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Variable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorsToDetails(List<? extends Throwable> list) {
        return go9.b("Last 25 errors:\n", j5g.g0(j5g.H0(list, 25), "\n", null, null, 0, new izs<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$errorsToDetails$errorsList$1
            @Override // xsna.izs
            public final CharSequence invoke(Throwable th) {
                String fullStackMessage;
                String fullStackMessage2;
                if (!(th instanceof ParsingException)) {
                    StringBuilder sb = new StringBuilder(" - ");
                    fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                    sb.append(fullStackMessage);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder(" - ");
                sb2.append(((ParsingException) th).getReason());
                sb2.append(": ");
                fullStackMessage2 = ErrorVisualMonitorKt.getFullStackMessage(th);
                sb2.append(fullStackMessage2);
                return sb2.toString();
            }
        }, 30));
    }

    private final String generateReport(boolean z) {
        String fullStackMessage;
        JSONObject jSONObject = new JSONObject();
        if (this.currentErrors.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Throwable th : this.currentErrors) {
                JSONObject jSONObject2 = new JSONObject();
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                jSONObject2.put("message", fullStackMessage);
                jSONObject2.put("stacktrace", mnh0.A(th));
                if (th instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th;
                    jSONObject2.put("reason", parsingException.getReason());
                    JsonNode source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.dump() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(SignalingProtocol.KEY_ERRORS, jSONArray);
        }
        if (this.currentWarnings.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (Throwable th2 : this.currentWarnings) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", mnh0.A(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z) {
            jSONObject.put("card", dumpCardWithContextVariables());
        }
        return jSONObject.toString(4);
    }

    public static /* synthetic */ String generateReport$default(ErrorModel errorModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return errorModel.generateReport(z);
    }

    private final VariableController getVariableController(ExpressionsRuntime expressionsRuntime) {
        return expressionsRuntime.getExpressionResolver().getVariableController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$0(ErrorModel errorModel, izs izsVar) {
        errorModel.observers.remove(izsVar);
    }

    /* renamed from: pasteToClipBoard-IoAF18A, reason: not valid java name */
    private final Object m134pasteToClipBoardIoAF18A(String str) {
        Div2Context context$div_release = this.div2View.getContext$div_release();
        Object systemService = context$div_release.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
            return s3q0.a;
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(str)));
            Toast.makeText(context$div_release, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            return s3q0.a;
        } catch (Exception e) {
            return new Result.Failure(new RuntimeException("Failed paste report to clipboard!", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ErrorViewModel errorViewModel) {
        this.state = errorViewModel;
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(errorViewModel);
        }
    }

    private final void showDetails() {
        setState(ErrorViewModel.copy$default(this.state, true, 0, 0, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String warningsToDetails(List<? extends Throwable> list) {
        return go9.b("Last 25 warnings:\n", j5g.g0(j5g.H0(list, 25), "\n", null, null, 0, new izs<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$warningsToDetails$warningsList$1
            @Override // xsna.izs
            public final CharSequence invoke(Throwable th) {
                String fullStackMessage;
                StringBuilder sb = new StringBuilder(" - ");
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                sb.append(fullStackMessage);
                return sb.toString();
            }
        }, 30));
    }

    public final void bind(Binding binding) {
        this.dataTag = binding.getTag();
        Disposable disposable = this.existingSubscription;
        if (disposable != null) {
            disposable.close();
        }
        this.existingSubscription = this.errorCollectors.getOrCreate(binding.getTag(), binding.getData()).observeAndGet(this.updateOnErrors);
    }

    public final void copyReportToClipboard() {
        boolean causedByTransactionTooLargeException;
        Throwable a = Result.a(m134pasteToClipBoardIoAF18A(generateReport$default(this, false, 1, null)));
        if (a != null) {
            causedByTransactionTooLargeException = ErrorVisualMonitorKt.causedByTransactionTooLargeException(a);
            if (causedByTransactionTooLargeException) {
                m134pasteToClipBoardIoAF18A(generateReport(false));
            }
        }
    }

    public final Map<String, VariableController> getAllControllers() {
        RuntimeStore runtimeStore$div_release = this.div2View.getRuntimeStore$div_release();
        Map<String, ExpressionsRuntime> uniquePathsAndRuntimes = runtimeStore$div_release.getUniquePathsAndRuntimes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("", getVariableController(runtimeStore$div_release.getRootRuntime()));
        for (Map.Entry<String, ExpressionsRuntime> entry : uniquePathsAndRuntimes.entrySet()) {
            linkedHashMap.put(entry.getKey(), getVariableController(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final izs<Throwable, s3q0> getErrorHandler() {
        return new ErrorModel$getErrorHandler$1(this.div2View);
    }

    public final void hideDetails() {
        setState(ErrorViewModel.copy$default(this.state, false, 0, 0, null, null, 30, null));
    }

    public final Disposable observeAndGet(final izs<? super ErrorViewModel, s3q0> izsVar) {
        this.observers.add(izsVar);
        izsVar.invoke(this.state);
        return new Disposable() { // from class: xsna.hwp
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorModel.observeAndGet$lambda$0(ErrorModel.this, izsVar);
            }
        };
    }

    public final void onCounterClick(int i, int i2) {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(150, this.div2View.getContext$div_release().getResources().getDisplayMetrics());
        if (i < dpToPx || i2 < dpToPx) {
            copyReportToClipboard();
        } else {
            showDetails();
        }
    }
}
