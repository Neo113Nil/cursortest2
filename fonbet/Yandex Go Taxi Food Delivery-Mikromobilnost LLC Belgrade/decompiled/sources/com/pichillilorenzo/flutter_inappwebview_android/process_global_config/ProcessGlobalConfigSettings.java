package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import android.content.Context;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import defpackage.hm91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qp41;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class ProcessGlobalConfigSettings implements ISettings<ProcessGlobalConfig> {
    public static final String LOG_TAG = "ProcessGlobalConfigSettings";
    public String dataDirectorySuffix;
    public DirectoryBasePaths directoryBasePaths;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings$DirectoryBasePaths] */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<ProcessGlobalConfig> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                if (key.equals("dataDirectorySuffix")) {
                    this.dataDirectorySuffix = (String) value;
                } else if (key.equals("directoryBasePaths")) {
                    this.directoryBasePaths = new DirectoryBasePaths().parse2((Map<String, Object>) value);
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("dataDirectorySuffix", this.dataDirectorySuffix);
        return hashMap;
    }

    public ProcessGlobalConfig toProcessGlobalConfig(Context context) {
        ProcessGlobalConfig processGlobalConfig = new ProcessGlobalConfig();
        if (this.dataDirectorySuffix != null && hm91.e(context, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")) {
            String str = this.dataDirectorySuffix;
            if (!qp41.A.a(context)) {
                throw qp41.a();
            }
            if (str.equals("")) {
                ny61.g("Suffix cannot be an empty string");
                return null;
            }
            if (str.indexOf(File.separatorChar) >= 0) {
                ny61.g(oyr.p("Suffix ", str, " contains a path separator"));
                return null;
            }
            processGlobalConfig.a = str;
        }
        if (this.directoryBasePaths == null || !hm91.e(context, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")) {
            return processGlobalConfig;
        }
        File file = new File(this.directoryBasePaths.dataDirectoryBasePath);
        File file2 = new File(this.directoryBasePaths.cacheDirectoryBasePath);
        if (!qp41.B.a(context)) {
            throw qp41.a();
        }
        if (!file.isAbsolute()) {
            ny61.g("dataDirectoryBasePath must be a non-empty absolute path");
            return null;
        }
        if (!file2.isAbsolute()) {
            ny61.g("cacheDirectoryBasePath must be a non-empty absolute path");
            return null;
        }
        processGlobalConfig.b = file.getAbsolutePath();
        processGlobalConfig.c = file2.getAbsolutePath();
        return processGlobalConfig;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(ProcessGlobalConfig processGlobalConfig) {
        return toMap();
    }

    public static class DirectoryBasePaths implements ISettings<Object> {
        public static final String LOG_TAG = "ProcessGlobalConfigSettings";
        public String cacheDirectoryBasePath;
        public String dataDirectoryBasePath;

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public Map<String, Object> getRealSettings(Object obj) {
            return toMap();
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        /* renamed from: parse, reason: avoid collision after fix types in other method */
        public ISettings<Object> parse2(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    key.getClass();
                    if (key.equals("dataDirectoryBasePath")) {
                        this.dataDirectoryBasePath = (String) value;
                    } else if (key.equals("cacheDirectoryBasePath")) {
                        this.cacheDirectoryBasePath = (String) value;
                    }
                }
            }
            return this;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("cacheDirectoryBasePath", this.cacheDirectoryBasePath);
            hashMap.put("dataDirectoryBasePath", this.dataDirectoryBasePath);
            return hashMap;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public /* bridge */ /* synthetic */ ISettings<Object> parse(Map map) {
            return parse2((Map<String, Object>) map);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<ProcessGlobalConfig> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }
}
